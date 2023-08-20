package chapter20;

import java.io.*;

public class SerializationMain {
    public static void main(String... args) {
        Product p = new Food("cookie", 300);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("prod.dat"));) {
            out.writeObject(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("prod.dat"))) {
            p = (Food) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(p);
    }
}
