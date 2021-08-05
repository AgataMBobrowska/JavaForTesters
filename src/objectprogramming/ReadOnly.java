package objectprogramming;

public class ReadOnly {

// gettery - metody do pobierania wartości z pól prywatnych (tylko do odczytu)
//    private String name = "John";
//    public String getName(){
//        return name + "is ok";
//    }

// settery - ustawienie wartości pola prywatnego
private String name = "Anna";
public void setName(String name){

    this.name = name;

}

}
