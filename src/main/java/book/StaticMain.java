package book;
import book.overrideoverload.StaticInitClass;
import static book.overrideoverload.StaticInitClass.FOO;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(FOO);
        System.out.println("running main");
        String name = StaticInitClass.class.getName();
        //StaticInitClass staticInitClass = new StaticInitClass();
    }
}
