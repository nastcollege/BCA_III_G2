package exception;

public class ArithDemo {

    public static void main(String[] args) {
        int n1=329;
        int n2=1;
        try {
            int c = n1 / n2;
            System.out.println("Division of "+n1 + " / "+n2 +" is: "+c);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("I am finally block");
        }
    }
}
