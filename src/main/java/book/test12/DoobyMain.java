package book.test12;

import java.util.List;

public class DoobyMain {
    class Booby {
    }

    class Dooby extends Booby {
    }

    class Tooby extends Dooby {
    }

    public class TestClass {
        List<Booby> bList = null;
        List<Dooby> dList = null;
        List<Tooby> tList = null;

        Booby b = new Booby();
        Tooby t = new Tooby();

        public void do1(List<? super Dooby> dataList) {
            dataList.add(t);
            dataList = dList;
            dataList = bList;
            //dataList = tList; // not valid.

            //1 INSERT CODE HERE
        }

        public void do2(List<? extends Dooby> dataList) {
            b = dataList.get(0);

            //2 INSERT CODE HERE
        }
    }
}
