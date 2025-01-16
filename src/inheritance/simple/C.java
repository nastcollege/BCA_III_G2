package inheritance.simple;

public class C extends  P{

   public void c(){
        System.out.println("I am child!!!");
    }

    public static void main(String[] args) {
        C c = new C();
        c.p();
        c.c();
    }
}
