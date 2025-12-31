import java.util.ArrayList;
import java.util.Scanner;

public class Q03_2_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<>();
        int lno, sumnegetive = 0, sumpositiveeven = 0, sumpositiveodd = 0;

        System.out.print("Enter the size of list : ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            lno = sc.nextInt();
            arraylist.add(lno);
        }

        for (int i = 0; i < size; i++) {
            if (arraylist.get(i) < 0) sumnegetive += arraylist.get(i);
            else if (arraylist.get(i) > 0 && arraylist.get(i) % 2 == 0) sumpositiveeven += arraylist.get(i);
            else sumpositiveodd += arraylist.get(i);
        }

        System.out.println("Sum of Negetive numbers : " + sumnegetive);
        System.out.println("Sum of Positive Even numbers : " + sumpositiveeven);
        System.out.println("Sum of Positive Odd numbers : " + sumpositiveodd);

        sc.close();
    }
}