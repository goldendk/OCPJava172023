package book.test8;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
//What will the following code print when compiled and run?

public class TestClass {

    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {

        IntFunction<IntUnaryOperator> fo = a -> {
            return b -> (a - b);
        };//1


        int x = operate(fo.apply(20)); //2
        System.out.println(x);
    }
}
