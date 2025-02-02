package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> contact = new HashMap<>();

        contact.put("bcahod","9858487106");
        contact.put("computerhod","9858487105");
        contact.put("principal","9858487111");
        System.out.println(contact);
        System.out.println(contact.get("principal"));
    }
}
