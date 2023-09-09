package book.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InitClass {

    class Super { static String ID = "QBANK"; }

    class Sub extends Super{
        static String subId = "foo";
        static { System.out.print("In Sub"); }
    }
     public static void main(String[] args){
            System.out.println(Sub.ID);

         int size = IntStream.range(0, 5).boxed().distinct().collect(Collectors.toList()).size();

         List<String> list = new ArrayList<>();
         list.add("");
         //list.add(2, "foo"); index out of bound exception.

     }

}
