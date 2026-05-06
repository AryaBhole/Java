interface Calculator {
    void calculate(int value);
}

class Square implements Calculator {
    int result; // This variable is inherited by Cube

    public void calculate(int value) {
        result = value * value;
        System.out.print("Square: " + result + " ");
    }
}

class Cube extends Square {
    public void calculate(int value) {
        result = value * value * value; // sets result to 27
        super.calculate(value);         // calls parent, which sets result to 9 and prints "Square: 9"
        System.out.print("Cube: " + result + " "); // result is now 9!
    }
}

public class Exam1 {
    public static void main(String[] args) {
        Calculator obj = new Cube();
        obj.calculate(3);
    }
}