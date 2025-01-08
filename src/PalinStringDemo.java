import java.util.Scanner;

/*
Write a program to check whether the user input string is
palindrome or not.
 */
public class PalinStringDemo {
    public static void main(String[] args) {

        //taking user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");

        String org=in.nextLine();

        String rev=new StringBuffer(org).reverse().toString();

        if (org.equals(rev)) {
            System.out.println(org + " is palindrome");
        } else {
            System.out.println(org + " not palindrome");
        }
        in.close();
    }
}
