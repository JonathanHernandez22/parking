public class entranceGate extends parkingLot {
    private int enterTime;

    public void setEnterTime(int enterTime){
        this.enterTime = enterTime;
    }
    public int getEnterTime(){
        return enterTime;
    }
    public boolean enter(){
        if(isFull()){
            return false;
        }
        else{
            capacity++;
            // for real time, I could start time here
            return true;
        }
    }
}
