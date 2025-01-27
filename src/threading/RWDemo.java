package threading;

public class RWDemo {
    public static void main(String[] args) {

        ReadingFromFile r = new ReadingFromFile();
        WritingToFile t = new WritingToFile("This is all about testjfsdfjsdnjf fddsjsjdnfjsd fdsjfnsdjknfjknsdf jsdjkfnsdnfkds fjknffsd fsdjk fsdkjfnjsdnfjkndsf sdjkfnkjdsnfsdf jfnsdkjknfsnd");
        Thread thread = new Thread(t);

        r.setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Reading: " + r.getPriority());
        System.out.println("Writing: " + thread.getPriority());

        r.start();
       thread.start();
    }
}
