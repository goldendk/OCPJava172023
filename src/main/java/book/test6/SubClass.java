package book.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubClass extends SuperClass{

    public static void main(String[] args) {
        List<SubClass> sub = new ArrayList<>();
        List<SuperClass> superList = new ArrayList<>();

        List<? extends SuperClass> superChildList = new ArrayList<>();
        sub.add(new SubClass());
        //sub.add(new SuperClass()); does not work.
        Optional<? extends SuperClass> var = Optional.of(new SuperClass());

        //superChildList.add(new SuperClass());
        //superChildList.add((new SubClass()));
        //superChildList.add(var.get());
    }
}
