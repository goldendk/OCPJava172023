package book.test10;

public class Test10Main {
    public static void main(String[] args) {
        var numA = new Integer[]{1, null, 3}; //1 - nulls are not allowed.
         //var list1 = List.of(numA); //2


        int i = 012;
        System.out.println(i);

        StringBuilder builder = new StringBuilder("abc");
        builder.delete(0, 1);
        System.out.println(builder);
    }
}
