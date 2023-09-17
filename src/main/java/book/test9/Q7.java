package book.test9;

public class Q7 {
    public static void main(String[] args) {
        int j = 1;
        try {
            int i =  doIt() / (j = 2);
        } catch (Exception e) {
            System.out.println(" j = " + j);
        }
    }

    public static int doIt() throws Exception {
        throw new Exception("FORGET IT");
    }


}
