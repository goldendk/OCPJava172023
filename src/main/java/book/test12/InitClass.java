package book.test12;

public class InitClass {
    public static void main(String args[]) {
        InitClass obj = new InitClass(5);
    }

    static {
        System.out.println("in before fields static init");
        //i1++;
    }
    {
        System.out.println("in instance init before variables");
        i1++; // static can be forward reachable.
      //  j++; //instance and static blocks have to have correct order with variables.
    }

    int m;
    static int i1 = 5;
    static int i2;
    int j = 100;
    int x;

    {
        System.out.println("in top instance init");
    }
    static {
        System.out.println("in top static init");
    }

    public InitClass(){
        //only called if specifically mentioned in other constructors.
        System.out.println("in no param constructor");
    }
    public InitClass(int m) {
        this();
        System.out.println("in constructor");
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
    }

    {
        System.out.println("in instance init");
        j = 30;
        i2 = 40;
    }  // Instance Initializer

    static {// Static Initializer
        System.out.println("in static init");
        i1++;
    }
}
