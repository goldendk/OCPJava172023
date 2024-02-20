package org.example.helper.locator;


import java.util.*;
import java.util.stream.*;
import org.example.helper.api.Helper;

public class Locator1 {
    
    public static Optional<Helper> getHelper() {
        ServiceLoader loader = ServiceLoader.load(Helper.class);
        Stream<ServiceLoader.Provider<Helper>> helperStream = loader.stream();
        return helperStream.map(ServiceLoader.Provider::get).findFirst();
    }
    
}