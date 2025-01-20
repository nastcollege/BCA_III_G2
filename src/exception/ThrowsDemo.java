package exception;

public class ThrowsDemo {
    public static void main(String[] args) {
        int n1=329;
        int n2=1;
        int[] marks = {98, 77, 83, 92, 100};
        try {
            divide(n1,n2);
            indexBounds(marks);

        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());

        }catch (ArrayIndexOutOfBoundsException  e){
            System.out.println("Illegal Item Access " + e.getMessage());

        }catch (Exception e){
            System.out.println("Contact to Admin"+e.getMessage());
        }finally{
            System.out.println("I am working here");
        }
    }

    public static void divide(int n1, int n2) throws ArithmeticException{
        int c = n1 / n2;
        System.out.println("Division of "+n1 + " / "+n2 +" is: "+c);
    }

    public static void indexBounds(int[] marks) throws ArrayIndexOutOfBoundsException{
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[7]);
    }
}
