package inheritance.multiple;

public class MultiDemo extends CParent implements IParent, IParent2{
    @Override
    public void iMethod() {
        System.out.println("interface 1 method");
    }

    @Override
    public void iMethod2() {
        System.out.println("interface 2 methjod");
    }

    public static void main(String[] args) {
        MultiDemo d = new MultiDemo();
        d.iMethod();
        d.iMethod2();
        d.cMethod();
    }
}
