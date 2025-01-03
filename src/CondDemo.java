import java.util.Scanner;

public class CondDemo {
    /*

    Write a program to show an example of conditional operator
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int result = n1>n2?n1:n2;
        System.out.println("Greater: "+result);

        result = n1<n2?n1:n2;
        System.out.println("Smallest: "+result);

        in.close();
    }
}
