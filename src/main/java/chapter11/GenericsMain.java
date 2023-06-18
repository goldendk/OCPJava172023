package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsMain {

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Number>();

        list.add(Integer.valueOf(2));

        //List<Integer> list2 = new ArrayList(); // compiler warning.

        Set set = new HashSet<String>();
        set.add("one");
        set.add(2);
        set.add("three");
        System.out.println(set);
    }

}
