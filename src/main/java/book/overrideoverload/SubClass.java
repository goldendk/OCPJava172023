package book.overrideoverload;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class SubClass extends SuperClass {
    //overrides correctly - the only one who does.
    public <T> List<T> getCollection(T t, Integer m){ return new ArrayList<T>(); }; // 1
     //public <T> Stream<T> getCollection(T t, Integer m){ return new ArrayList<T>(); }; //2

    //non co-variant return type.
    //public <T> void getCollection(T t, Integer m){ return new ArrayList<T>(); }; //3


    //just a method. does not override or overload.
     public <T> List<T> getCollection(String t, Integer m){ return new ArrayList<T>(); };//4

    //overloads //4
     public <T> Object getCollection(String t, Integer m, Float f){ return new ArrayList<T>(); };//4a
}
