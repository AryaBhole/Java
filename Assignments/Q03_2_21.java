import java.util.Scanner;

public class Q03_2_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};
        char input;
        boolean found = false;

        System.out.print("Enter your alphabet : ");
        input = sc.next().charAt(0);
        input = Character.toUpperCase(input);
        
        for (int i = 0; i < 5; i++) {
            if (input == vowel[i]) found = true;
        }

        if (found) System.out.println("Vowel");
        else System.out.println("Consonent");
    }
}