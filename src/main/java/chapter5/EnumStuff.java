package chapter5;

import java.util.EnumMap;
import java.util.EnumSet;

public enum EnumStuff {
    A {
        @Override
        public int getInt() {
            return 1;
        }
        //foo() is not accessible, even if it is public.
         public void foo()  {
            System.out.println("");
        }
    }, B;
    public int getInt() {return 0;}

    public static void main(String... args){
        EnumStuff a = EnumStuff.A;
        if(a == EnumStuff.A){
        }
        EnumSet<EnumStuff> set = EnumSet.of(EnumStuff.B);
        EnumMap<EnumStuff, String> map = new EnumMap<>(EnumStuff.class);
        map.put(EnumStuff.A, "A");

    }
}
