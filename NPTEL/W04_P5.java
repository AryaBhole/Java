import java.util.Scanner;

public class W04_P5 {

    static class Calculator {

        // Public method
        public int add(int a, int b) {
            return a + b;
        }

        private int add(int a, int b, int c) {
            return a + b + c;
        }

        public void printThreeSum(int x, int y, int z) {
            int sum = add(x, y, z);
            System.out.println("Sum of three numbers: " + sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Sum of two numbers: " + calc.add(a, b));
        calc.printThreeSum(x, y, z);

        sc.close();
    }
}