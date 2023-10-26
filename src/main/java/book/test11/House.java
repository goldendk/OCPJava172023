package book.test11;

class House {
    interface IHouse {
        int VALUE = 2;

        public default String getAddress() {
            return "101 Main Str";
        }

        static String getName() {
            return null;
        }
    }

    interface Office {
        int VALUE = 3;

        public default String getAddress() {
            return "101 Smart Str";
        }

        static String getName() {
            return null;
        }
    }


    class HomeOffice implements IHouse, Office {
        public final static int VALUE = 3;

        @Override
        public String getAddress() {
            return IHouse.super.getAddress();
        }

        public String getName() {
            return null;
        }
    }

    class SubHomeOffice extends HomeOffice {

//        public static String getAddress() {
//            return "";
//        }
    }
}