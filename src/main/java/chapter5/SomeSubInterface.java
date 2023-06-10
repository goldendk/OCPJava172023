package chapter5;

public interface SomeSubInterface extends SomeInterface {
    public static final String SOME_CONSTANT = "BAR";
    @Override
    abstract String getString();
    private  int somePrivateMethod() {
        return -1;
    }

}
