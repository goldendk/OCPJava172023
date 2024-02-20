package org.example.app;

import org.example.model.foo.FooService;
import org.example.helper.api.Helper;
import org.example.helper.locator.Locator1;
import java.util.Optional;
public class ApplicationMain {
    
    
    
    public static void main(String[] args){
        FooService fooService = new FooService();
        
         Optional<Helper> optHelper = org.example.helper.locator.Locator1.getHelper();
         int input = 4;
         String help = optHelper.get().getHelp(input);
         System.out.println("Help is " + help + " from " + input);
    }
}