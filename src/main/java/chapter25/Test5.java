package chapter25;

@Test5Annotation
public class Test5<@Test5Annotation(value = "a") T> {
    @Test5Annotation({"a", "b"})
    private T var;

    public Test5(T var) {
        this.var = var;
    }
}
