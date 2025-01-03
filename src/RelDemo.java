import java.util.Scanner;

public class RelDemo {
    /*
    Write a program to illustrate an example of relational operator
    >, <, >=, <=, ==, !=

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        //>
        System.out.println(n1 + ">" + n1 + " is:" + (n1 > n2));

        //<
        System.out.println(n1 + "<" + n1 + " is:" + (n1 < n2));

        //>=
        System.out.println(n1 + ">=" + n1 + " is:" + (n1 >= n2));

        //<
        System.out.println(n1 + "<=" + n1 + " is:" + (n1 <= n2));

        //==
        System.out.println(n1 + "==" + n1 + " is:" + (n1 == n2));

        //!=
        System.out.println(n1 + "!=" + n1 + " is:" + (n1 != n2));
        in.close();
    }
}
