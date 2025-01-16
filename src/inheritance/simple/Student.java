package inheritance.simple;

public class Student extends Person {
    //property of child class
    private double fee;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setPersonInfo("Subham", "Bishwokarma");
        student.setFee(50000);
        student.displayPersonInfo();
        System.out.println("Fee: " + student.getFee());
    }
}
