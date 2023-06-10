package chapter5.sealed_stuff;

public sealed interface Book permits AudioBook, MixedExtends, PrintedBook, SubInterface {
    void print();
}
