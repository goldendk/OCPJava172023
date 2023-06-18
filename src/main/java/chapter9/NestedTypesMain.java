package chapter9;

import chapter8.MathMain;

public class NestedTypesMain {

    //ERROR: the book says on page 507 that only a non-static member class can extend another class in implement interfaces.
    // Clearly this is wrong.
    static class StaticInnerClass extends MathMain {
        /* can be static */ static class staticInnerInnerClass {

        }
    }

    interface InnerInterface{}

    enum InnerEnum{FOO, BAR }

    record InnerRecord(String name, int age){}

    void someMethod(){

        class InsideMethodClass{

        }
        // this is wild!
        InsideMethodClass insideMethodClass = new InsideMethodClass();

        interface InsideMethodInterface{}

        enum InsideMethodEnum{}

        record InsideMethodRecord(int age, String name){}

        InsideMethodRecord record = new InsideMethodRecord(2, "foo");

    }

    void someOtherMethod(){
        //not available.
        //InsideMethodClass insideMethodClass = new InsideMethodClass();
        //InsideMethodRecord record = new InsideMethodRecord(2, "foo");

        InnerClass innerClass = new NestedTypesMain().new InnerClass();
    }

    class InnerClass extends MathMain {
        //static inner / outer can be combined in several ways.
        public static final String s = "";
        static class InnerInnerClass{

        }
    }
}
