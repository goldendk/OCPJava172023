package book.test7;

public class TestClass2 {
    interface House{
        default String getAddress(){
            return "1";
        }
    }

    interface House2{
        default String getAddress(){
            return "2";
        }
    }

  //  class SomeClass implements House, House2{ // not allowed.

   // }
}
