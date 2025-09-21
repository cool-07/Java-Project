import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){
        String s = "pizza";
//        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<Character>();
        int wrongGuess= 0;
        for (int i=0; i< s.length();i++){
            arr.add('_');
        }

        System.out.println("Welcome to hangman Game");

//        System.out.println(getHangmanArt(wrongGuess));

       while (wrongGuess <6){
           System.out.println(getHangmanArt(wrongGuess));
           System.out.print("Words: ");
           for (char c: arr){
               System.out.print(c+" ");
           }
           System.out.println();
           System.out.print("Guess a letter: ");
           char letter = scanner.next().toLowerCase().charAt(0);

           if (s.indexOf(letter) >= 0){
               System.out.println("correct guess!!\n");
               for (int i=0;i<s.length();i++){
                   if(s.toLowerCase().charAt(i) == letter){
                       arr.set(i,letter);
                   }
               }
                if (!arr.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("You Won");
                    System.out.println("the corredt word is "+ s);
                    break;
                }
               System.out.println(arr);

           }
           else {
               System.out.println("wrong guess!!\n");
               wrongGuess++;
           }
       }
       String middleFinger="\uD83D\uDD95";
       if (wrongGuess>=6){
           System.out.println(getHangmanArt(wrongGuess));
           System.out.println("You lost MF!!!");
           System.out.println("********"+middleFinger+"********");
           System.out.println("The right word was: "+ s);
       }
    }
    static String getHangmanArt(int wrongGuess) {
        String ans="";
        return switch (wrongGuess){
            case 0 -> ans= """
                    
                    
                    
                    """;
            case 1-> """
                       0
                    
                    
                    """;
            case 2-> """
                       0
                       |
                    
                    """;
            case 3-> """
                       0
                      /|
                    
                    """;
            case 4-> """
                       0
                      /|\\
                    
                    """;
            case 5-> """
                       0
                      /|\\
                      /
                    """;
            case 6-> """
                       0
                      /|\\
                      / \\
                    """;
            default -> "no hangman created for this input";
    };
    }
}
