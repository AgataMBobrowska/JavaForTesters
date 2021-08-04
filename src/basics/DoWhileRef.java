package basics;

public class DoWhileRef {

    public static void main(String[] args) {
        int number=21;
        do{
            System.out.println("Przykładowa wartość to: " +number+ " i jest mniejsza od 20");
            number++;
        }
        while (number < 20);
    }
}
