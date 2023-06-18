package chapter7;

public class Exceptions {

    public void foo() throws Throwable {
        //Throwable and Exception are checked!
        throw new Throwable("some message");
    }

    public void bar(){
        //error and runtime exceptions are *not* checked.
        throw new Error("some message");
    }


    public static void main(String... args) throws A {
        try{
            action();
        }
        catch(A e){
            throw e;
        }
    }

    public static void check() throws A{
        action();
    }

    private static void action() throws B {
        throw new B();
    }

    private static void multiCatch(){
        try{
            action();
        } catch (B | RuntimeException e) {


        }

    }
}

class A extends Throwable{}

class B extends  A{}
