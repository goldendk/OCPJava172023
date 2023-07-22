package chapter14;

import java.util.Arrays;
import java.util.Comparator;

public class ComparisonMain {
    public static void main(String... args){
        Integer[] array = {-42, 15, -23, 19,11, 71};
        Arrays.sort(array, (v1, v2)->v1.toString().compareTo(v2.toString()));
        System.out.println(Arrays.toString(array));
        System.out.println("-42".compareTo("-23"));
        System.out.println("-23".compareTo("-42"));


        Person p1 = new Person("Tom", 20);
        Person p2 = new Person("Dick", 30);
        Person p3 = new Person("Tom", 40);
        System.out.println((p1.compareTo(p2) < 0) + " " + (p1.compareTo(p3) < 0));
    }

    static class  Person implements Comparable<Person>{
        private String name;
        private int age;

        public Person(String dick, int i) {
            name = dick;
            age = i;
        }

        @Override
        public int compareTo(Person o) {
            Comparator<String> strCmp = Person.cmp();
            int status = strCmp.compare(this.name, o. name);
            if(status == 0){
                Comparator<Integer> intCmp = Person.cmp();
                status = intCmp.compare(this.age, o.age);
            }
            return status;
        }
        private static <E extends Comparable<E>> Comparator<E> cmp() {
            return (e1, e2)->e2.compareTo(e1);
        }
    }
}
