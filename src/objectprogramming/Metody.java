package objectprogramming;

public class Metody {
    public void policzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for(int i=0; i<100; i++) {
            result = result+i;
        }
        System.out.println("Wynik to: "+result);
    }
    public void policzWynikParam(int number) {
        System.out.println("Number ma wartość: "+number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for(int i=0; i<number; i++) {
            result = result+i;
        }
        System.out.println("Wynik to: "+result);
    }

    public void add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: "+(firstNumber+secondNumber));
    }
}
