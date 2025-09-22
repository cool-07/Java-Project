import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for Countdown: ");
        int response = scanner.nextInt();
        System.out.println();
//        scanner.nextLine();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count<=0){

                    System.out.println("BOOM Time's Up!!");

                timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task,0,1000);
//        System.out.println("BOOM Time's Up!!");


    }
}
