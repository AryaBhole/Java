import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musicplayer{
    public static void main(String[] args) {
        String Filepath = "Music.wav";
        File file = new File(Filepath);

        try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)) {    
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your response : ");
                response = scanner.next().toUpperCase();
                switch (response) {
                case "P" -> clip.start();
                case "S" -> clip.stop();
                case "R" -> clip.setMicrosecondPosition(0);
                case "Q" -> clip.close();
                default -> System.out.println("Invalid Choice");
            }
            }

            

        } 
        catch (Exception e) {
            System.out.println("Someting went wrong");
        }
    }
}