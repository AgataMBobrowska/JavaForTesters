package objectprogramming;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        metody.policzWynik();
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);

        metody.add(2,3);
    }
}
