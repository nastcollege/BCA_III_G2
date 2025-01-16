import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //taking users input

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = in.nextLine();
        System.out.println("Enter another String");
        String s2 = in.nextLine();

        //length()
        System.out.println(s1 + " has: " + s1.length() + " characters");
        System.out.println(s2 + " has: " + s2.length() + " characters");

        //compareTo()
        System.out.println(s1.compareTo(s2));

        //equals()
        if (s1.equals(s2)) {
            System.out.println("Both String are Matched!");
        } else {
            System.out.println("Both String are Different!");
        }
        //==

        //equalsIgnoreCase()
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both String are Matched! with case ignore");
        } else {
            System.out.println("Both String are Different! with case ignore");
        }
        //concat()
        System.out.println(s1.concat(s2));

        //toUpperCase()
        System.out.println(s1.toUpperCase());

        //toLowerCase()
        System.out.println(s2.toLowerCase());

        //toCharArray()
        char[] chars = s1.toCharArray();

        for (char c : chars) {
            System.out.println(c);
        }
        //indexOf(index)
        System.out.println(s1.indexOf("S"));

        //re place
        System.out.println(s1.replace("N","M"));

    }
}
