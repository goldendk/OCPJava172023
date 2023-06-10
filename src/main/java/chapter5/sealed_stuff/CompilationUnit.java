package chapter5.sealed_stuff;

public sealed class CompilationUnit {
    public void foo(){
        SomeOtherClass o = new SomeOtherClass();
        o.bar();


    }
private static class SomeOtherClass {
        public void bar(){

        }
    }

}

non-sealed class OtherClass extends CompilationUnit {

}
//this is accessible outside the class, so is not 'hidden' from other classes in the same package.
class SomeOtherClass {
    public void bar(){

    }
}


