package p2;
import p1.*;

import java.util.Random;
import java.util.Scanner;

public class Rando {
    public static void main(String[] args){
        Rando rand = new Rando();
//        Method meth = new Method();
//        rand.hello();
//        Random rand= new Random();
//
//        int check1= rand.nextInt(1,7);
//        int check2= rand.nextInt(1,7);
//
//        if(check1 == check2){
//            System.out.println("you won by magic number " + check1);
//        }
//        else{
//            System.out.println("Better Luck next time!");
//        }
//        double p= Math.pow(2,3);
//        p=Math.abs(-89);
//        p=Math.sqrt(34);
//        p=Math.round(3.5);
//        p=Math.floor(3.55);
//        p=Math.PI;
//        System.out.println(p);
//        int price1= 9;
//        int price2= 405900;
//        int price3= 19;

        //System.out.printf("when i was going to the market so i found three interesting thing there price are price1 % .3f and price2 % ,.2f and price3 % .3f",price1,price2,price3);
        //this is called giving the width in the values to get the in same way
//        System.out.printf("%06d\n",price1);
//        System.out.printf("%d\n",price2);
//        System.out.printf("%06d\n",price3);
        Scanner sc = new Scanner(System.in);
//        int []arr= new int[5];
//        for (int i=0;i<5;i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i=0;i<5;i++){
//            System.out.printf("%d, ",arr[i]);
//        }

        //dice roller program
        Random random = new Random();
        int roll;
        int total=0;
        System.out.print("Enter the number of roles: ");
        int noOfroles = sc.nextInt();

        if(noOfroles<=0){
            System.out.println("you want see heaven value should be more then 0");
        }
        else{
            System.out.println("no of roles are "+ noOfroles);
        }

        for (int i=0;i<noOfroles;i++){
            roll = random.nextInt(1,7);
            System.out.println("roll: "+ roll);
            dieRoll(roll);
            total += roll;
        }
        System.out.println("the total of dice are: "+ total);


    }
    static void dieRoll(int roll){
        String roll1= """
                -------
               |       | 
               |   ■   |
               |       |
                -------
                """;
        String roll2= """
                -------
               | ■     | 
               |       |
               |      ■|
                -------
                """;
        String roll3= """
                -------
               | ■     | 
               |   ■   |
               |      ■|
                -------
                """;
        String roll4= """
                -------
               | ■    ■| 
               |       |
               | ■    ■|
                -------
                """;
        String roll5= """
                -------
               |■     ■| 
               |   ■   |
               |■     ■|
                -------
                """;
        String roll6= """
                -------
               | ■    ■| 
               | ■    ■|
               | ■    ■|
                -------
                """;
        switch (roll){
            case 1 -> System.out.println(roll1);
            case 2 -> System.out.println(roll2);
            case 3 -> System.out.println(roll3);
            case 4 -> System.out.println(roll4);
            case 5 -> System.out.println(roll5);
            case 6 -> System.out.println(roll6);

        }
    }
}
