package inheritance.hierarchical;

public class Dog extends Animal{
    void bark(){
        System.out.println("how how");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setInfo("Runku","White");
        d.displayInfo();
        d.bark();
    }
}
