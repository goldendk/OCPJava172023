package book.overrideoverload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SuperClass {
    public <T> Collection<T> getCollection(T t, Integer n) {
        return new ArrayList<T>();
    }

    public String fetch(List<?> foo){
        return null;
    }

    public String fetch2(List<SuperClass> foo){
        return null;
    }
}
