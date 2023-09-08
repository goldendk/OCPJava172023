package book.test3.OO;

public class OOMain {
    public static void main(String[] args) {
        SubInterface si = new SubInterfaceImpl();
        SubInterface subInterface = si.returnsSomeInterface();
    }
}
