public class Switch {
    public static void main(String[] args) {

        String danie = "Pizza";

        switch (danie){
            case "Pizza":
                System.out.println("Cena to 30 złotych");
                break;
            case "Kopytka:":
                System.out.println("Cena to 15 złotych");
                break;
            case "Frytki":
                System.out.println("Cena to 10 złotych");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
