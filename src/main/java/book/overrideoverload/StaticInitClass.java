package book.overrideoverload;

public class StaticInitClass {
    public static final String FOO = "foo";
    static {
        System.out.println(StaticInitClass.class.getName() + " initializer");
    }
}
