package book.test3.OO;

public class SubSubInterfaceImpl extends SubInterfaceImpl{
    @Override
    public Number onlyInSubInterface() {
        return null;
    }




    @Override
    Double onlyInParentClass(int i) throws IndexOutOfBoundsException {
        return 0.0;
    }

    Number onlyInParentClass(int i, String s){
        return null;
    }

}
