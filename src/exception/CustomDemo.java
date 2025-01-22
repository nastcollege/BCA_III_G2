package exception;

import java.util.Scanner;

public class CustomDemo {
    public static void main(String[] args) {
        boolean studyAtNAST=false;
//
//        //optional code start
//        Scanner in = new Scanner(System.in);
//        System.out.println("Are you student of NAST? Yes/No");
//        String choice = in.nextLine();
//        in.close();
//        if (choice.equalsIgnoreCase("yes")) {
//            studyAtNAST = true;
//        } else {
//            studyAtNAST = false;
//        }

        //optional code end

        try {
            getStudentInfo(studyAtNAST);
        } catch (InvalidStudentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getStudentInfo(boolean studyAtNAST) throws InvalidStudentException {
        if (studyAtNAST) {
            System.out.println("Welcome to NAST 25th Anniversary");
        } else {
            throw new InvalidStudentException("You are not valid student");
        }
    }
}
