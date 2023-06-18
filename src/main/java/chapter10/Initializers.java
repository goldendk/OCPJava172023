package chapter10;

public class Initializers {
    int length = 10;
    //double area = length * width; // illegal.

    int width = 10;

    static int someStaticThing;
    static {
        someStaticThing = 10;
        var some = "";
    }


}
