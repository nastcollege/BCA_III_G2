package inheritance.hierarchical;

public class MC extends P{
    void mc(){
        System.out.println("I am male child!");
    }

    public static void main(String[] args) {
        MC mc = new MC();
        mc.pm();
        mc.mc();
    }
}
