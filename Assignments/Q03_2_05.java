import java.util.Scanner;

public class Q03_2_05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, z1, x2, y2, z2, result;

        System.out.print("Enter Co-ordinates of the First point (x y z) : ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        z1 = scanner.nextInt();

        System.out.print("Enter Co-ordinates of the Second point (x y z) : ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        z2 = scanner.nextInt();

        result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));

        System.out.printf("The distance between the two points(%.2f, %.2f, %.2f) and (%.2f, %.2f, %.2f) is %.2f\n", x1, y1, z1, x2, y2, z2, result);

        scanner.close();
    }
}