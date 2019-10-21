import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {



    public static void main(String[] args) throws FileNotFoundException {

        /*
        File Input will have time listed in military time, where the first time is the start and the
        second is the end time
         */
        String fileName = "input1.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        parkingLot businessLot = new car(); // Probably a bad way to initialize this
        while(sc.hasNextLine()){
            // File will have lines that look like this:
            // 700 1200
            String[] split = sc.nextLine().split(" ");
            int startTime = Integer.parseInt(split[0]);
            int endTime = Integer.parseInt(split[1]);
            businessLot = new car(startTime,endTime);
        }
        businessLot.printProfit();
        businessLot.printProfitLost();
    }
}
