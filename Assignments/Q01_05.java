import java.util.Scanner;

public class Q01_05{
    public static void main(String[] args) {
        int sum = 0, input;
        String x;
        Scanner scanner = new Scanner(System.in);

        do { 
            System.out.print("Enter a number : ");
            input = scanner.nextInt();

            sum += input;

            System.out.print("Press 'x' to exit or any other key to continue: ");
            x = scanner.next();
        } while (!x.equals("x"));

        System.out.println("The sum of all the entered numbers is : " + sum);

        scanner.close();
    }
}