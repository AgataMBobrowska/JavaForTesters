public class InstrukcjaWarunkowaElseIfRef {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("liczba większa od zera");
        } else if (number < -10) {
        System.out.println("Liczba mniejsza od -10");
        }else if(number == 0) {
            System.out.println("Liczba równa zero");
        }else{
            System.out.println("Liczba w przedziale 0 do - 10");
        }
    }
}
