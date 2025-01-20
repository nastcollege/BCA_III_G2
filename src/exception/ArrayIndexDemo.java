package exception;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] marks = {98, 77, 83, 92, 100};
        try {
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);

            System.out.println(marks[3]);
            System.out.println(marks[4]);
            System.out.println(marks[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Illegal Item Access " + e.getMessage());
        }finally{
            System.out.println("I am working in a finally block");
        }
    }
}
