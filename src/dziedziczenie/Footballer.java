package dziedziczenie;

public class Footballer extends Person {

    public String footballClub;

    public Footballer( String name, int age, String footballClub) {
        super(name,age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void eat(){
        System.out.println("I like healthy food");
    }
    public void walk(){
        System.out.println("I walk very fast");
    }

    public void  playFootball() {
        System.out.println("I'm playing football "+footballClub);
    }
}
