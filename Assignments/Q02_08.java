import java.util.Scanner;

public class Q02_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char temp;

        System.out.print("Enter a string to check : ");
        String input = scanner.next();

        char[] strarray = input.toCharArray();

        for (int i = 0; i < input.length() / 2; i++) {
            temp = strarray[i];
            strarray[i] = strarray[input.length() - 1 - i];
            strarray[input.length() - 1 - i] = temp;
        }

        String str = new String(strarray);

        if (input.equalsIgnoreCase(str)) System.out.println("Yes");
        else System.out.println("No");

        scanner.close();
    }
}