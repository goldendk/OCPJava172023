package chapter5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InstanceOfPatternMatch {
    private List<String> list = new LinkedList<>();
    public void foo(){
        List<String> list = new ArrayList<>();

        //not allowed to shadow local variables.
        //List<String> arrayList = new ArrayList<>();

        //shadow field.
        if(list instanceof ArrayList<String> arrayList) {
            arrayList.ensureCapacity(3);
        }else{
            // not in scope here.
            // arrayList.ensureCapacity();
        }

        //book says we get a compile time error on next line but only get
        // error in first line of if-scope.
        if(list instanceof ArrayList<String> arrayList || list.isEmpty()){
            //arrayList.ensureCapacity(); //compile time error
        }

        //and conditional operator generates the variable.
        if(list instanceof ArrayList<String> arrayList && list.isEmpty()){
            arrayList.ensureCapacity(3); //compile time error
        }

        // not operator 'toggles' which block the variable is available in.
        if(!(list instanceof ArrayList arrayList) ){
            //not available.
            //arrayList.ensureCapacity(3);
        }
        else{
            arrayList.ensureCapacity(3);
        }
    }
}
