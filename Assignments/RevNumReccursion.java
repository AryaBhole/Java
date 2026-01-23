public class RevNumReccursion {

    public static int sum = 0;

    public static void rev (int num) {
        if (num == 0) return;
        sum = num % 10 + sum * 10;
        rev (num / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        rev (num);
        System.out.println("Reversed Number " + sum);
    }
}