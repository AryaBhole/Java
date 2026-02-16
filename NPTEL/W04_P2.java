import java.util.Scanner;

public class W04_P2 {

    // Car class with a public variable
    static class Car {

        // Public variable
        public int speed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read speed value
        int s = sc.nextInt();

        // Create object of Car
        Car c = new Car();

        // Assign value to public variable
        c.speed = s;

        System.out.print("Speed is: " + c.speed);

        sc.close();
    }
}