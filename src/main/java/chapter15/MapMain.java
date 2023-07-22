package chapter15;

import java.util.*;

public class MapMain {
    public static void main(String... args){

        Map<Integer, String> map = new HashMap<>();
        //map.put(112, "Denmark");
        map.put(112, null);
        map.put(999, "UK");

        // re-mapping function only called if the key has an existing non-null value.
        map.merge(112, "Norway", (old, n)->old+n);

        System.out.println(map);


        NavigableSet<String> ns = new TreeSet<>(Collections.reverseOrder());
        ns.addAll(List.of("Step", "Jump", "Hop"));

        NavigableSet<String> ns2 = new TreeSet<>(ns);
        System.out.println(ns2);

        NavigableMap<String, Integer> nm = new TreeMap<>();
        nm.forEach((String k,Integer v)->{});
        nm.computeIfAbsent("Step", (k)->{return 3;});


        Deque<String> deque = new ArrayDeque<>();
        //deque.offer()

        TreeSet<Integer> ts = new TreeSet<>();
        //ts.add()
        ArrayList<Integer> ls = new ArrayList<>();
        //ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(2, null);

        //Error on 15.20 - says the right answer in the description but lists the wrong answer.

    }
}
