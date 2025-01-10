//class
public class Student {
    //properties
    private String name;
    private int age;
    //default constructor
    public Student(){
        name="Santosh";
        age=22;
    }
    //parameterized constructor
    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args) {
        //create an instance using default constructor
        Student student =new Student();
        System.out.println(student.name + " "+student.age);
        //create an instance using parameterized constructor
        Student s = new Student("Motiram",20);
        System.out.println(s.name + " "+s.age);
    }
}
