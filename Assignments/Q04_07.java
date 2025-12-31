import java.util.Scanner;

public class Q04_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Enter a Natural number : ");
        input = scanner.nextInt();

        if (checkprime(input)) System.out.printf("The number %d is prime\n", input);
        else System.out.printf("The number %d is not prime\n", input);
    }

    public static boolean checkprime(int i) {
        if (i == 1) return false;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}