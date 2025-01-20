package inheritance.hierarchical;

public class FC extends P{

    void fc(){
        System.out.println("Female child");
    }

    public static void main(String[] args) {
        FC fc = new FC();
        fc.pm();
        fc.fc();
    }
}
