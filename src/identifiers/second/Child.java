package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    public void testIdentifier(){
        System.out.println(first);
//        System.out.println(second);
        System.out.println(third);

        firstMethod();
//        secondMethod();
        thirdMethod();
    }
}
