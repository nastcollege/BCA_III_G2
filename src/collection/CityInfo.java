package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many city you want to enter?");
        int citySize=scanner.nextInt();

        //duplicate item, dynamic list
        List<String> cities= new ArrayList<>();
        for(int i=0;i<citySize;i++){
            cities.add(scanner.next());
        }
        System.out.println(cities);
        for(String c:cities){
            if(c.toLowerCase().endsWith("k")){
                System.out.println(c);
            }
        }
    }
}
