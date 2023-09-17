package book.test9;

public class Q10 {

   // Consider the following method -

    public float parseFloat( String s ){
        float f = 0.0f;
        try{
            f = Float.valueOf( s ).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;
            return f;
        }
        finally{
            f = 10.0f;
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Q10().parseFloat("0.0"));
    }
    //What will it return if the method is called with the input "0.0" ?
}
