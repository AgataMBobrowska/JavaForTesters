package identifiers.first;
    public class Child extends Parent{
        public void testIdentifier() {
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
//            System.out.println(fourth); nie ma dostępu do pól private

            firstMethod();
            secondMethod();
            thirdMethod();
//            fourthMethod(); nie ma dostępu
        }
    }

