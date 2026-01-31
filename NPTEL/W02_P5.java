import java.util.Scanner;

public class W02_P5 {

    static class Circle {
        int radius;
        // BEGINNER INSTRUCTION:
        // Constructor name must match class name.
        // Parameter and variable have same name.
        // Use 'this' to avoid confusion.

        // TODO: Write constructor here
        Circle(int radius) {
            this.radius = radius;
        }

        

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        Circle c = new Circle(r);

        System.out.println("Radius of the circle is: " + c.radius);
        sc.close();
    }
}