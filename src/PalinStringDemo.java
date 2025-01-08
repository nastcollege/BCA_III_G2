import java.util.Scanner;

/*
Write a program to check whether the user input string is
palindrome or not without using builtin methods.
 */
public class PalinStringDemo {
    public static void main(String[] args) {
        //taking user input

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String messsge = in.nextLine();

        //hello world

        //dlrow olleh
        int len = messsge.length();
        char[] rev = new char[len];
        int c = 0;
        for (int i = len - 1; i >= 0; i--) {
            rev[c] = messsge.charAt(i);
            c++;
        }

        //compare
        System.out.println(messsge);
        System.out.println(rev);
        if (messsge.equals(rev)) {
            System.out.println(messsge + " is palindrome");
        } else {
            System.out.println(messsge + " not palindrome");
        }
        in.close();
    }
}
