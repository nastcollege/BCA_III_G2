package poly;

import inheritance.hierarchical.Cat;

import java.util.Scanner;

public class Remote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature");
        int temp=in.nextInt();

        AC ac;
        if(temp<20) {
            ac = new Heater();
        }
        else{
            ac= new Cooler();
        }
        ac.on();
        ac.off();


    }
}
