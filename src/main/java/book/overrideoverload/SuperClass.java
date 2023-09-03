package book.overrideoverload;

import java.util.ArrayList;
import java.util.Collection;

public class SuperClass {
    public <T> Collection<T> getCollection(T t, Integer n) {
        return new ArrayList<T>();
    }
}
