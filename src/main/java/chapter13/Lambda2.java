package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Lambda2 {
    public static void main(String... args){
        List<String> values = new ArrayList<>(List.of("A", "B", "Cee"));
        String s = values.get(0).substring(0, 1);
        //values.removeIf(s->s.toLowerCase().startsWith(s));

        Predicate<String> p = (t)->t == null;

        //BiFunction divide = (x, y)-> x/y;
        //System.out.println(divide.apply(0.0, 0));

        Function f1 = (x) -> "<" + x;
        Function f2 = (x) -> x + ">";

        System.out.println(f2.compose(f1).apply(42));


        //13.8
        UnaryOperator<String> uo1 = (ss)->ss.toUpperCase();
        UnaryOperator<String> uo2 = (ss)->ss.toLowerCase();
//      UnaryOperator<String> uo3 = uo2.compose(uo1);


    }
}
