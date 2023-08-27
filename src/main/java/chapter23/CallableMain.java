package chapter23;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class CallableMain {
    public static void main(String... args) {
        AtomicLong atomicLong = new AtomicLong();

        Callable<Number> c = ()->{
            AtomicLong along = atomicLong;
            return atomicLong.incrementAndGet();
        };
        Collection<Callable<Number>> cc = List.of(c, c, c);
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Future<Number>> futures = null;

        try {
            futures = es.invokeAll(cc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();

        try{
            futures.stream().mapToLong(v->{
                try {
               return     v.get().longValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }).forEach(v-> System.out.println(v));
            System.out.println(atomicLong);
        }
        catch (Exception e){

        }

    }
}
