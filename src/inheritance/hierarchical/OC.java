package inheritance.hierarchical;

public class OC extends P{
    void oc(){
        System.out.println("Other Child");
    }

    public static void main(String[] args) {

        OC oc = new OC();
        oc.pm();
        oc.oc();
    }
}
