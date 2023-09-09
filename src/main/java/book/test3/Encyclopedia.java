package book.test3;

interface Encyclopedia extends Book{

    default String fooStatic(){ //NOTE: this does not override the static method.
        return null;
    }

    //static String getId(){ return "AIN8888"; }
}
