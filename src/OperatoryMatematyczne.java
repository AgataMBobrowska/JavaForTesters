// operatory matematyczne pozwalają na wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;  // 10
        int subtraction = firstNumber - secondNumber;     // -2
        int multiplication = firstNumber * secondNumber;     // 24
        float division = thirdNumber/secondNumber;      // 0,66
        int mod = secondNumber%firstNumber;     // 2

        System.out.println("Dodawanie:" + addition);
        System.out.println("Odejmowanie:" + subtraction);
        System.out.println("Mnożenie:" + multiplication);
        System.out.println("Dzielenie:"  + division);
        System.out.println("Modulo:" + mod);

        firstNumber+=secondNumber;
        System.out.println("po dodaniu:" + firstNumber);    //10
        firstNumber-=secondNumber;
        System.out.println("po odjęciu:" + firstNumber);   //4
        firstNumber*=secondNumber;
        System.out.println("po mnożeniu:" + firstNumber);   //24
        firstNumber/=secondNumber;
        System.out.println("po dzieleniu:" + firstNumber ); //4
        firstNumber%=secondNumber;
        System.out.println("po modulo:" + firstNumber);     //4
    }
}
