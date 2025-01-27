package threading;

import java.io.FileOutputStream;

public class WritingToFile implements Runnable {
    private String text;

    public WritingToFile(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fos = new FileOutputStream("program.txt");
            for (int i = 0; i < text.length(); i++) {
                fos.write(text.charAt(i));
                System.out.println("Writing: "+text.charAt(i));
               // Thread.sleep(700);
            }
            fos.close();
        }catch (Exception e){
            System.out.println("RW: "+e.getMessage());
        }
    }
}
