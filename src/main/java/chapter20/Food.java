package chapter20;

public class Food extends Product {
    private int calories;

    public Food(String name, int calories) {
        super(name);
        this.calories = calories;
        System.out.println("food ");
    }

    @Override
    public String toString() {
        return super.toString() + " " + calories;
    }
}
