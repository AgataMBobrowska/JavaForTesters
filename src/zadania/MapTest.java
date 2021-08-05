package zadania;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String > students = new HashMap<>();
        students.put(1,"Basia");
        students.put(2,"Tomek");
        students.put(3, "Basia");

        System.out.println(students.get(1));
    }
}
