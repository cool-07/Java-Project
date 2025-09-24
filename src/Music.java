import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Music {
    public  static void main(String[] args){

        String filepath ="src\\This-Is-My-Kingdom-Come.wav";
        File file = new File(filepath);
        Scanner scanner = new Scanner(System.in);

        try(AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
//            clip.start();
            String response = "";
            while (!response.equals("Q")){

                System.out.println("P= Play");
                System.out.println("S= Stop");
                System.out.println("R= Reset");
                System.out.println("Q= Quit");
                System.out.print("What do you want next: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R"-> clip.setMicrosecondPosition(0);
                }
            }

            System.out.println("no problem detected");
        }
        catch (FileNotFoundException e){
            System.out.println("couldn't locate file.");
        }
        catch (LineUnavailableException e){
            System.out.println("Line couldn't find");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("audio file unsupported");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
            System.out.println("Bye!");
        }
    }
}
