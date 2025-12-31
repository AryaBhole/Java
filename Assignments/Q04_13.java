import java.util.Scanner;

public class Q04_13 {
    public static void main(String[] args) {
        int l, h;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start and end point (l h) : ");
        l = scanner.nextInt();
        h = scanner.nextInt();

        int[] result = primeinrange(l, h);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static int[] primeinrange (int l, int h) {
        int index = 0;
        int[] temp = new int[h - l + 1];

        for (int i = l; i <= h; i++) {
            if (checkprime(i)) {
                temp[index] = i;
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static boolean checkprime(int i) {
        if (i == 1) return false;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}