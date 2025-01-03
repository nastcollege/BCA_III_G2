public class ScientificCalculator {


    //square
    void square(double n) {
        System.out.println("Square:" + (n * n));
    }

    //cube
    void cube(double n) {
        System.out.println("Cube:" + (n * n*n));
    }

    //add
    void add(double m, double n) {
        System.out.println("Sum:" + (m +n));
    }
    //sub
    void sub(double m, double n) {
        System.out.println("Difference:" + (m -n));
    }

    //mul
    void multiple(double m, double n) {
        System.out.println("Multiple:" + (m *n));
    }
    //div
    void division(double m, double n) {
        System.out.println("Division:" + (m /n));
    }
    public static void main(String[] args) {
       //
        ScientificCalculator s = new ScientificCalculator();
        s.square(3.1);
        s.cube(3.1);
        s.add(2,3);
        s.division(20,3);
        s.multiple(5,6);
        s.sub(3,3);
    }
}
