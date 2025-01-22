package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = in.nextLine();
        in.close();

        //character Stream
        try {
            //writing to a file
            FileWriter fos = new FileWriter("bca.txt");
            fos.write(text);
            fos.close();
            System.out.println("Success");

            //reading from a file
            FileReader fis = new FileReader("bca.txt");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
