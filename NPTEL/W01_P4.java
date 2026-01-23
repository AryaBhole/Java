import java.util.Scanner;

public class W01_P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
    	for (int i = 1; i < 5; i++) {
		System.out.println(number + " x " + i + " = " + number * i);
		}
        in.close();
    }
}