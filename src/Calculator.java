import java.util.Scanner;

public class Calculator {

    void add(double n1, double n2){
        System.out.println(n1+n2);
    }

    void sub(double n1, double n2){
        System.out.println(n1-n2);
    }

    public static void main(String[] args) {
        //creating instance for user input
        Scanner in = new Scanner(System.in);
        //creating an object of calculator class
        Calculator calculator = new Calculator();
        System.out.println("Enter two number");
        //read user input
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        //calling method of calculator class
        calculator.add(n1, n2);
        calculator.sub(n1, n2);
        in.close();
    }
}
