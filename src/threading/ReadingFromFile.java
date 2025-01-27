package threading;

import java.io.FileInputStream;

public class ReadingFromFile extends Thread {
    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\acer\\IdeaProjects\\BCA_III_G2\\src\\CitizenOlderToYounger.java");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println("Reading: "+(char) c);
               // Thread.sleep(200);
            }
            fis.close();

        } catch (Exception e) {
            System.out.println("RD:"+e.getMessage());
        }
    }
}
