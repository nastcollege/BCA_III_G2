import java.util.Scanner;

/*
Write a program to take input of 100 citizen
and display age in older to younger and count total
no of citizen whose  age is greater than or equals
to average age.
 */
public class CitizenOlderToYounger {
    public static void main(String[] args) {
        int[] ages = new int[100];

        //create object of Scanner class to take input from user
        Scanner in = new Scanner(System.in);

        //taking 100 citizens age

        for (int i = 0; i < 100; i++) {
            System.out.println("Enter age of " + (i + 1) + " citizen");
            ages[i] = in.nextInt();
        }

        //sorting and calculate average age;
        int totalAge = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (ages[i] < ages[j]) {
                    int temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
            totalAge += ages[i];
        }

        double averageAge = totalAge / 100;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(ages[i]);
            if (ages[i] > averageAge) {
                count++;
            }
        }
        System.out.println("Average age: "+averageAge);
        System.out.println("total no of citizen whose age is greater than or equals to average age: "+count);
    }
}
