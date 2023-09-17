package book.test4;

public record Journal(int id, String name) {

    public Journal(int id){
        this(id*2, "Foo");
    }


//    public Journal{ //not allowed since it is the same as the canonical constructor at the bottom just in compact forms.
//
//    }

//    public Journal() {            //1 // not allowed since non-canonical constructors must delegate.
//
//        this.id = 10;
//        this.name = "none"; //2
//        // 3
//    }


    //same as default constructor for records.
    public Journal(int id, String name) {
        this.id = id;
        this.name = name;
    }
}