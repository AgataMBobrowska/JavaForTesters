package objectprogramming;

public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public static String nazwaUczelni = "AGH"; //pole statyczne

    public void przedstawSie(){
        System.out.println("Nazywam się "+imię+ " " +nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguję się za pomocą "+nick);
    }

    public void podajEmail(){
        System.out.println("Mój email to: "+email);

        }
    public static void infoUczelnia(){
        System.out.println("Studenci "+nazwaUczelni);
    }
}
