package chapter20;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;

    public Product(String name) {
        this.name = name;
        System.out.println("product ");
    }

    @Override
    public String toString() {
        return name;
    }
}
