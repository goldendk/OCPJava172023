package chapter5;

import java.util.Arrays;

public class ArrayStuff {
    public void foo(){
        m1(new int[][]{{2,3}, {4,5}});
    }

    //An int[] array is an int[][] !
    private void m1(int[]... somearr){
        System.out.println(Arrays.toString(somearr));
    }

    public static void main(String... args){
        new ArrayStuff().foo();
    }
}
