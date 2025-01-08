import java.util.Scanner;

/*
Write a program to check user input is greater than 100.
 */
public class IfDemo {
    public static void main(String[] args) {
        //taking user input

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        //if example
        if (num > 100) {
            System.out.println(num + " is greater than 100");
        }
        in.close();
    }
}
