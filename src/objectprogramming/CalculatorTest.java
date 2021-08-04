package objectprogramming;

import java.util.Scanner;

public class CalculatorTest {
    // Program prosi użytkownika o podanie dwóch liczb, a później wykonuje na nicha działania matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("proszę, podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("proszę, podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber,secondNumber);
        int subtraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mult(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);

        System.out.println("Dodawanie: "+addition);
        System.out.println("Odejmowanie: "+subtraction);
        System.out.println("Mnożenie: "+multiplication);
        System.out.println("Dzielenie: "+division);
        System.out.println("Modulo: "+mod);

    }
}
