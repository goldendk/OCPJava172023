package chapter15;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String... args){

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(2, null);
    }
}
