import static java.lang.Math.abs;
public class ticket {
    /*
    There's room to add varying ticket prices depending on hours.
    For right now, it's a set 5$/hr

     */
    public int calcTicketPrice(int startTime, int endTime){
        int timeDiff = endTime - startTime;
        if(timeDiff == 0){
            return 5;
        }
        else{
            if(startTime < 0 || endTime < 0){
                System.out.println("Error: Negative time was received.");
                return -1;
            }
            else {
                return roundUp(startTime, endTime) * 5;
            }
        }
    }
    private  int roundUp(int num, int divisor){
        return(num+divisor-1)/divisor;
    }
}
