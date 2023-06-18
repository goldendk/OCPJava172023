package chapter11;

public class Box <T> {

    public Box(){
        System.out.println(this);
    }
    public <V> Box(T value){
        System.out.println(value);
    }
    public <V> Box(T t, V v){
        System.out.println(t + ", " + v);
    }

}
