import java.util.Scanner;

public class Threading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("You have 5 seconds toenter your name : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}