package book.test10;

import java.util.function.Function;

public class Q20 {
    class TestClass {
        public double process(double payment, int rate) {
            double defaultrate = 0.10;        //1
            if (rate > 10) defaultrate = rate;  //2
            class Implement {
                public int apply(double data) {
                    Function<Integer, Integer> f = x->x+(int)(x*rate);
                    //BiFunction<Integer, Double, Integer> f = (m, n)->m+(int)(n*m);
                    return f.apply((int) data); //4 not allowed to use a non-final variable in the inner class.
                }
            }
            Implement i = new Implement();
            return i.apply(payment);
        }
    }
}
