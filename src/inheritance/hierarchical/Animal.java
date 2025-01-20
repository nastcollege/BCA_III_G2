package inheritance.hierarchical;

public class Animal {
    private String name;
    private String color;

    void setInfo(String name, String color){
        this.name=name;
        this.color=color;
    }
    void displayInfo(){
        System.out.println("Name: "+name + " Color: "+color);
    }
}
