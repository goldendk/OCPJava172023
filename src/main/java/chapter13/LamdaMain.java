package chapter13;

public class LamdaMain {
    public static void main(String... args){

        AgreementB b = ()->System.out.println("foo");
    }

    interface AgreementA{
        void doIt();

    }
    interface AgreementB extends AgreementA{

        void doIt();
        //not that this simple implements the basic equals from Object.class.
        boolean equals(Object o);

    }


}
