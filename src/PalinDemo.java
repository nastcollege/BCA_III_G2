import java.util.Scanner;

/*
Write a program to check whether the user input number is
palindrome or not
 */
public class PalinDemo {
    public static void main(String[] args) {
        //taking user input

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        int org = num;

        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        //if else example
        if (rev == org) {
            System.out.println(org + " is palindrome");
        } else {
            System.out.println(org + " not palindrome");
        }
        in.close();
    }
}
