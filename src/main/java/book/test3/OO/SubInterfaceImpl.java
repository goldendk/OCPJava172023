package book.test3.OO;

public class SubInterfaceImpl implements SubInterface {

    /*
    @Override
    public Integer returnsInt(String stringParam) throws MyMyException  { // we are allowed to remove exceptions in throw clause or add a subclass.
        return null;
    }
*/
    @Override
    public Integer returnsInt(String stringParam) throws IndexOutOfBoundsException { // we are allowed to remove exceptions in throw clause or add a new un-checked exception.
        return null;
    }


    @Override
    public SubInterface returnsSomeInterface() {
        return null;
    }
}
