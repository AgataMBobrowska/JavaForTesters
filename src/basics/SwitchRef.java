package basics;

public class SwitchRef {
    public static void main(String[] args) {
        String danie = "pizza";

        switch (danie){
            case "pizza":
                System.out.println("Cena to 22 złote");
                break;
            case "Tagiatelle":
                    System.out.println("Cena to 30 złotych");
                    break;
            case "Frytki":
                System.out.println("Cena to 10 złotych");
                break;
            default:
                System.out.println("Nie mamy takiego dania");
        }
    }
}
