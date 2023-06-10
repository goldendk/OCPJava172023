package chapter5;

public class InstanceOfMatching {
    private static class A{}
    private static class B extends A {}
    private static class C extends B {}
    public void foo(){
        B o = new B();
        var a = (o instanceof B) &&(!(o instanceof A));


        var x = Integer.valueOf(42);
        //type check when assigning must be a subtype!
        //if(x instanceof Integer i){
        //    i++
        //}
        Integer i = null;

        if(i instanceof Integer){
            System.out.println("yes");
        }
    }
    public static void main(String... args){
        new InstanceOfMatching().foo();
    }
}
