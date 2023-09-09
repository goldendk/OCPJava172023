package book.test3;

interface Book{
    static String fooStatic(){
        return null;
    }
  default String getId(){
     return "ISBN123456";
  }
}
