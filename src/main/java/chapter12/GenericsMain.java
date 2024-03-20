package chapter12;

import java.util.List;

public class GenericsMain {

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    public class Singleton<T> {

        public static <T> T getInstance() {
            // if (instance == null);
            //  instance = new Singleton<T>();

            //      return (T) instance;
            return null;
        }

        //  private static T instance = null; //not allowed.

    }
}
