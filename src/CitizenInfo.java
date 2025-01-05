import java.util.Scanner;

/*
Write a program to take name and age of 10 citizen
 and display name and age of citizen whose age is
 eligible for voting. Also count the total no of voters.
 */
public class CitizenInfo {
    public static void main(String[] args) {
        //declare names and ages array to hold name and age of 10 citizen.
        String[] names = new String[10];
        int[] ages = new int[10];

        //create object of Scanner class to take input from user
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name and age of " + (i + 1) + " citizen");

            //to take string as input use in.nextLine()
            names[i] = in.next();

            //to take int as input use in.nextInt();
            ages[i] = in.nextInt();
        }

        //display voters name and age>=18
        int count = 0;
        for (int i = 0; i < 10; i++) {

            if (ages[i] >= 18) {
                count++;
                System.out.println("Name: " + names[i] + " and Age: " + ages[i]);
            }
        }
        System.out.println("Total no of Voters: " + count);

    }
}
