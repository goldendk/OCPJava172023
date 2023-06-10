package chapter5;

public class SubSubClass extends SubClass{

    public void callSuperClass(){
        //Super.this.someMethod(2);
        ((Super)this).someMethod(2);
    }

    public static void main(String... args){
        new SubSubClass().callSuperClass();
    }
}
