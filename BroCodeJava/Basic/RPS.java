import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ranno = new Random();

        char uoption, yn, coption = 'R';
        do {

            int num = ranno.nextInt(3);

            System.out.print("Enter your choice (R, P or S : )");
            uoption = scanner.next().charAt(0);

            switch (num) {
                case 0:
                    coption = 'R';
                    break;
                case 1:
                    coption = 'P';
                    break;
                case 2:
                    coption = 'S';
                    break;
            }

            System.out.println("You Picked : " + uoption);
            System.out.println("Computer Picked : " + coption);

            if (uoption == coption) {
                System.out.println("It's a Tie");
            }
            else if (uoption == 'R' && coption == 'S' || uoption == 'P' && coption == 'R' ||    uoption == 'S' && coption == 'P') {
                System.out.println("You Win");
            }
            else {
                System.out.println("Computer Wins");
            }

            System.out.print("Wanna play again ? (Y / N) : ");
            yn = scanner.next().charAt(0);
        }while (yn == 'Y');
    }
}
