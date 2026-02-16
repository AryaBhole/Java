import java.util.Scanner;

public class W04_P4 {

    static class Employee {

        // Protected variable
        protected int salary;
    }

    static class Manager extends Employee {
        // Inherits salary
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        Manager m = new Manager();

        m.salary = s;
		System.out.print("Salary is: " + m.salary);

        sc.close();
    }
}