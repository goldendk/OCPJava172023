package book.test7;
class A {
    public Integer getCode(){ return 2;}
}

class AA extends A { 
  //public Long getCode(){ return 3L;} // not allowed...
}

public class TestClass33 {
    
    public static void main(String[] args) throws Exception {
         A a = new A();
        A aa = new AA();
        System.out.println(a.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}