package book;

public record SomeRecord (int id, String name){
    public SomeRecord{
        id = id+1;
        name = "foo";
    }

    public static void main(String[] args) {
        System.out.println(new SomeRecord(2, "a"));
    }
}
