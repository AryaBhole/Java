import java.util.Scanner;
class W03_P1{
    //Create recursive method to find factorial of a number

public static int factorial(int x){
      if(x == 0 || x == 1){
        return  1;
      }
      else{
        return factorial(x - 1) * x;
      }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.println(factorial(x));   
  }
}