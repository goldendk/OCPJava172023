package chapter8;

public class WrapperClassesMain {
    public static void main(String... args){

        Integer i = 1000;
        int j = 1000;
        boolean b = i == j;
        System.out.println("b = " + b);
        int j2 = Integer.valueOf(1000);
        boolean b2 = j == j2;


        System.out.println("b2 = " + b2);
        int j3 = Integer.valueOf(1000);
        boolean b3 = j2 == j3;
        System.out.println("b3 = " + b3);

        Integer x1 = Integer.valueOf(10) * Integer.valueOf(10) * 10;
        System.out.println("x1 = " + x1);
        Integer x2 = Integer.valueOf(10) * Integer.valueOf(10) * 10;
        System.out.println("x2 = " + x2);
        boolean b4 = x1 == x2;
        System.out.println("b4 = " + b4);
        System.out.println(x1.getClass().isPrimitive());

        boolean b5 = Boolean.parseBoolean(" true ");
        System.out.println("b5 = " + b5);
        boolean b6 = Boolean.parseBoolean("true");
        System.out.println("b6 = " + b6);
    }
}
