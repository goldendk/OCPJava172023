package book.test9;

public class Q4 {


    public static boolean getBool(){
        return true;
    }
    public static String getString(){
        return "true";
    }
    public static void main(String args[]){
        boolean b =createBoolean();
      /*  switch(b){
            case false: String s = "E";break;
            case true: String y = "E"; break;
        }
        switch( getBool() ){
            case true -> System.out.println("true");
            default -> System.out.println("none");
        }

       */
    }

    private static boolean createBoolean() {
        return Math.random() > 0.5;
    }

//    What changes can be done so that it will print only true?

}
