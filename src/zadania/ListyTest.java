package zadania;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Mike");
        names.add("Anna");
        names.add("Jack");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println(names.indexOf("Jack"));      //który na liście jest dany element
        System.out.println(names.lastIndexOf("Jack"));  //ostatni element z listy
        System.out.println(names.contains("Monica")); // czy zawiera daną wartość
        System.out.println(names.size()); //ile elementów na liście
        System.out.println(names.isEmpty()); //czy lista jest pusta


        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);
    }
}
