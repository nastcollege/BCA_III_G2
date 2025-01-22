package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = in.nextLine();
        in.close();

        //byte Stream
        try {
            //writing to a file
            FileOutputStream fos = new FileOutputStream("message.txt");
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Success");

            //reading from a file
            FileInputStream fis = new FileInputStream("message.txt");
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
