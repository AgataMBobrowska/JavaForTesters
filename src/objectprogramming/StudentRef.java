package objectprogramming;

public class StudentRef {
    public String imię;
    public String nazwisko;
    public String nick;
    public String email;

    public void przedstawSie(){
        System.out.println("Nazywam się: "+imię+" "+nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguję się za pomocą"+ nick);
    }
}
