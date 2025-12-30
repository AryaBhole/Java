public class Palindrome{
    public static void  main(String[] args){
        int x = -12, y = 0, x1, x2 = 0;
        if (x < 0) System.out.println("False");

        x1 = x;

        while (x > 0) {
            x2 = x2 * 10 + x % 10;
            x /= 10;
        }

        if (x1 == x2) System.out.println("True");
        else System.out.println("Flase");
    }
}