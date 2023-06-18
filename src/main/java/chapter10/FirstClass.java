package chapter10;

public class FirstClass {
    static int gap = 10;
    double length;
    final boolean active;

    {
        //tricky. Must initialize the final boolean in an initializer or constructor.
        active = (gap>5) ; length = 5.5 + gap;
    }
}
