package zadania;

import java.util.HashSet;
import java.util.Set;

public class ZbiorTest {
    // set przechpwuje unikalne elementy
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");

        vege.addAll(fruits);

        System.out.println(vege.size());
    }

}
