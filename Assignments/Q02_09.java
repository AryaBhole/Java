import java.util.Scanner;

public class Q02_09{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting point : ");
        int start = scanner.nextInt();

        System.out.print("Enter ending point : ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int temp = i, sum = 0;
            while (temp != 0) {
                sum = sum  + ((temp % 10) * (temp % 10) * (temp % 10));
                temp /= 10;    
            }
            if (sum == i) System.out.println(i);
        }
        scanner.close();
    }
}