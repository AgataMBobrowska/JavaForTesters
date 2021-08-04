package basics;

public class OperatoryMatematyczneRef {
    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/ secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Dodawanie:" + addition);
        System.out.println("Odejmowanie:" + subtraction);
        System.out.println("Mnożenie:" + multiplication);
        System.out.println("Dzielenie:"  + division);
        System.out.println("Modulo:" + mod);

        firstNumber+=secondNumber;
        System.out.println("po dodaniu:" + firstNumber);
        firstNumber-=secondNumber;
        System.out.println("po odjęciu:" + secondNumber);
        firstNumber*=secondNumber;
        System.out.println("po mnożeniu:" + firstNumber);
        firstNumber/=secondNumber;
        System.out.println("po dzieleniu:" + firstNumber );
        firstNumber%=secondNumber;
        System.out.println("po modulo:" + firstNumber);


    }
}
