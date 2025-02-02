package collection;

import java.util.*;

public class StudentNameInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student name you want to enter?");
        int nameSize=scanner.nextInt();

        //unique items, dynamic set
        Set<String> names= new HashSet<>();
        for(int i=0;i<nameSize;i++){
            names.add(scanner.next());
        }
        System.out.println(names);
    }
}
