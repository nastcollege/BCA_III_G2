package inheritance.multilevel;

public class C extends P{
    public void c(){
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        C c = new C();
        c.gp();
        c.p();
        c.c();
    }
}
