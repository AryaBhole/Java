import java.util.Scanner;

public class W02_P1 {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read the length of the rectangle
        int length = sc.nextInt();

        // Read the width of the rectangle
        int width = sc.nextInt();

        int area = length * width;

        // Print the calculated area
        System.out.println("Area is: " + area);

        // Close the scanner
        sc.close();
    }
}