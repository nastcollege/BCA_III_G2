package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyPasteCharacterDemo {
    public static void main(String[] args) {
        try{
            FileReader fis = new FileReader("tum.png");
            FileWriter fos = new FileWriter("donaltum.png");
            int c;
            while((c=fis.read())!=-1){
                fos.write((char)c);
            }
            fis.close();
            fos.close();
            System.out.println("Copy Paste Success");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
