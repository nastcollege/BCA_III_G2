package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPasteByteDemo {
        public static void main(String[] args) {
            try{
                FileInputStream fis = new FileInputStream("tum.png");
                FileOutputStream fos = new FileOutputStream("donaltum.png");
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
