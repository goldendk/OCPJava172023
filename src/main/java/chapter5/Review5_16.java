package chapter5;

public abstract class Review5_16 {
    //review question 5.16 claims that this line will
    // compile without the type in the line - this is false.
    public static final int MAX_SIZE = 10;

    public abstract void measure(int size);

    public static class Cat extends Review5_16 {
        private int size;

        @Override
        public void measure(int size) {
            this.size = (size < MAX_SIZE) ? size : Review5_16.MAX_SIZE;
        }
    }

}
