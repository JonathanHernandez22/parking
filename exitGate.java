public class exitGate extends parkingLot {
    private int exitTime;

    public void setExitTime(int exitTime){
        this.exitTime = exitTime;
    }
    public int getExitTime(){
        return exitTime;
    }
    public void getTicket(){
        capacity--; // freed up a spot
    }
    public int calcNecessaryPayment(ticket t, entranceGate enter){
        return t.calcTicketPrice(enter.getEnterTime(), this.getExitTime());
    }
    public void receivePayment(int payment){ // could make it boolean, so that it checks if payment was received
        updateTotalProfit(payment);
    }
}
