package poly;

public class Heater extends AC{
    @Override
    void on() {
        System.out.println("Heater ON");
    }

    @Override
    void off() {
        System.out.println("Heater OFF");
    }
}
