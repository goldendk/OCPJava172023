package book.test3.OO;

import java.io.IOException;

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

    @Override
    public Number onlyInSubInterface() { // removed throws clause, but override is still valid.
        return null;
    }


    Number onlyInParentClass(int i) throws IOException, RuntimeException {
        System.out.println("SubInterfaceImpl#onlyInParentClass");
        return null;
    }

}
