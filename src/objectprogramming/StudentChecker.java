package objectprogramming;

import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni; //pole statyczne
        Student.infoUczelnia();

        Student adam = new Student();
        adam.imię = "Adam";
        adam.nazwisko = "Adamski";
        adam.nick = "AdamskiA";
        adam.email = "adamskia@uczelnia.pl";

        Student kasia = new Student();
        kasia.imię = "Kasia";
        kasia.nazwisko = "Adamska";
        kasia.nick = "AdamskaK";
        kasia.email = "adamskak@uczelnia.pl";

        Student piotr = new Student();
        piotr.imię = "Piotr";
        piotr.nazwisko = "Piotrowski";
        piotr.nick = "PiotrowskiP";
        piotr.email = "piotrowskip@uczelnia.pl";

        Student[] students = new Student[3];
        students[0]=adam;
        students[1]=kasia;
        students[2]=piotr;

        for (int i=0; i< students.length;i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].zalogujSie();
        }

        String imię = "Kasia;";
        imię.strip();
        Scanner scanner = new Scanner(System.in);
    }
}
