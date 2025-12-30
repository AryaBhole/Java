import java.util.Scanner;

public class Q02_07{
    public static void main(String[] args){
        int first = 0, second = 1, temp = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter upto where you wan to print your series : ");
        int input = scanner.nextInt();
        
        if (input > 0) System.out.print(first + " "); 
        if (input > 1) System.out.print(second + " ");
        do {
            temp = first + second;
            first = second;
            second = temp;
            if (input > temp) System.out.print(second + " ");
        }while(input > temp);
        System.out.println();
        scanner.close();
    }
}