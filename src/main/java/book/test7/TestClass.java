package book.test7;

class TestClass {
    void probe(int... x) {
        System.out.println("In ...");
    }  //1

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(long x) {
        System.out.println("In long");
    } //3

    void probe(Long x) {
        System.out.println("In LONG");
    } //4

    public static void main(String[] args) {
        Integer a = 4;
        new TestClass().probe(a); //5
        int b = 4;
        new TestClass().probe(b); //6

        double f = 43e1;
        System.out.println(f);


        String s1 = "Hello World";
        String s2 = """             
                       Hello World""";
        System.out.println((s1 == s2) + " " + s1.equals(s2));
        System.out.println(s1.hashCode() + " " + s2.hashCode());
    }
}