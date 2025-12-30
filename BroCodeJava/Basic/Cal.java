import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1;
        float num2;
        float result = 0;
        char operator;

        System.out.print("Enter your first number : ");
        num1 = scanner.nextFloat();

        System.out.print("Enter your second number : ");
        num2 = scanner.nextFloat();

        System.out.print("Enter the operator : ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Enter a valid operator");;
        }

        System.out.println("Your result is : " + result);

        scanner.close();
    }
}
