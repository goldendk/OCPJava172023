package chapter5;

public class InterfaceMain {

    private static class SomeClass implements SomeSubInterface    {

        @Override
        public String getString() {
            return null;
        }
    }


    public static void main(String... args){
        String s = SomeClass.SOME_CONSTANT;
    }
}
