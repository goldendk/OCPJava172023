package book.test3.OO;

public interface SubInterface extends SomeInterface {

    // @Override - not valid on static methods.
    static void someStaticMethod(){

    }


    //we are allowed to remove exceptions from the throws clause but not add new ones.
    // Can add sub-classes of exceptions in the overridden method.
    @Override
    Integer returnsInt(String stringParam) throws MyException;

    @Override
    SubInterface returnsSomeInterface(); // both are valid due to co-variant return types.
//    SomeInterface returnsSomeInterface();


    Number onlyInSubInterface();
}
