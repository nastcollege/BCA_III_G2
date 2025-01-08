import java.util.Scanner;

/*
Write a program to take age input from user and determine
eligibility for voting if age is greater than or equals to 18
 */
public class VoterEligibility {
    public static void main(String[] args) {
        //taking input from user
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = in.nextInt();
        if(age>=18){
            System.out.println("Eligibal for Voting!");
        }
        in.close();
    }
}
