package book.test6;

import java.util.ArrayList;
import java.util.List;

class Tooby extends Dooby {

    public static void main(String[] args) {
        var bL = new ArrayList<Booby>();
        var tL = new ArrayList<Tooby>();
        List<? extends Booby> bV = new ArrayList<>();
        List<? super Dooby> dV = new ArrayList<>();


        dV.add(new Dooby(){ });

        bV = bL;

        dV = bL;


        bV = tL;

       // dV = tL; // wrong since dV should have Dooby or it's super clases which Tooby is clearly not.

        //bV.add(new Booby()); //wrong since we cant know which kind of list is assigned to bV - if a list of Tooby then adding a Booby is clearly wrong and
        // visa-versa. Lists that generified should only contain the type they are born to have.

        //simpler example:

        List<? extends Number> numbers = new ArrayList<>();

      //  numbers.add(new Integer(3)); // not allowed.

        List<? super Integer> superIntegerList = new ArrayList<>();
        //superIntegerList.add(new Float(2.0f)); // not allowed.

        //Basically wildcard capture is to use the interface knowledge to run code (operation on the members), not to add or subtract from them.
    }

    private static void addHelper(List<Booby> list, Booby entity){
        list.add(entity);
    }

}