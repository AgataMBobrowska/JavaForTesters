package dziedziczenie;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Juniors");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();

    }
}
