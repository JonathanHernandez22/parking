public abstract class parkingLot {
    static int capacity = 50;
    int enterTime;
    int exitTime;
    private entranceGate enter;
    private exitGate exit;
    private ticket currentTicket;
    private car carType;
    static int totalProfit = 0;
    static int profitLost = 0;
    public parkingLot(){}
    public parkingLot(int enterTime, int exitTime){
        this.enterTime = enterTime;
        this.exitTime = exitTime;
        carEnter();
        carExit();
    }
    public boolean isFull(){
        return capacity == 50;
    }
    public void updateTotalProfit(int profit){
        totalProfit+=profit;
    }
    public void updateProfitLost(int lostProfit){profitLost += lostProfit;}
    public void carEnter(){
        if(enter.enter()) {
            enter.setEnterTime(enterTime);
        }
        // Assuming that if parkingLot is full, then the person will leave instead of wait
        // Ask them how long they would've stayed for, and do a profit loss based on their word
        updateProfitLost(currentTicket.calcTicketPrice(enterTime,exitTime));
    }
    public void carExit(){

        exit.getTicket(); // could a check here to see if ticket was received
        // been in a couple of reserved parking lots, where if you lose your ticket, you have to pay a flat
        // full day fee
        exit.setExitTime(exitTime);
        exit.receivePayment(exit.calcNecessaryPayment(currentTicket, enter));

    }
    public void printProfit(){
        System.out.println("Profit gained: " + totalProfit);
    }
    public void printProfitLost(){
        System.out.println("Profit lost: " + profitLost);
    }
}
