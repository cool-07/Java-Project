import java.util.Scanner;

public class Banking {
    double deposit(double amnt,double total){
        total += amnt;
        return total;
    }
    double withdraw(double amnt,double total){
        if(total<amnt){
            System.out.println("in sufficient amount");
        }
        total -= amnt;
        return total;
    }
    public static void main(String[] args){
        boolean flag=true;
        double total_balance = 100;
        while(flag) {

            Banking obj = new Banking();
            System.out.println("******Welcome to Ritesh Bank******");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("choose from options(1-4): ");
            String check = sc.nextLine();

            switch (check) {
                case "1" -> System.out.println("your balance is: " + total_balance);
                case "2" -> {
                    System.out.print("Enter the amount: ");
                    double amount = sc.nextDouble();
                    total_balance=obj.deposit(amount, total_balance);
                    try {
                        // This pauses the program for 3000 milliseconds (3 seconds)
                        System.out.println("⟳");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // Handle any interruption that might occur
                        e.printStackTrace();
                    }
                }
                case "3" -> {
                    System.out.print("Enter the amount: ");
                    double amount = sc.nextDouble();
                    total_balance=obj.withdraw(amount, total_balance);
                    System.out.printf("thanks for withdrawing ₹%.1f",amount);
                }
                case "4" -> {
                    flag=false;

                    try {
                        // This pauses the program for 3000 milliseconds (3 seconds)
                        System.out.println("⟳");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // Handle any interruption that might occur
                        e.printStackTrace();
                    }
                    System.out.println("Thanks for visiting.");
                }
            }
        }
    }
}
