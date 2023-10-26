package book.test10;

public class VirtualMethodDetermination {

    public void m(A a){}
    public void m(B a){}
    public void m(C a){}
    //public void m(Foo a){}

    public static void main(String[] args) {
        VirtualMethodDetermination virtualMethodDetermination = new VirtualMethodDetermination();
        virtualMethodDetermination.m(null);
    }

}

class A{}
class B extends A{}
class C extends B{
}
class Foo{}
