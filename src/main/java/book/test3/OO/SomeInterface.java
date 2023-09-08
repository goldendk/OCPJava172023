package book.test3.OO;

import java.io.IOException;

public interface SomeInterface {
    int INT_CONSTANT = 0;

    static void someStaticMethod(int i) {

    }
    default SomeInterface returnsSomeInterface(){
        return null;
    }

    Number returnsInt(String stringParam) throws IOException, RuntimeException;

}
