package chapter23;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class BarrierLatchMain {
    public static void main(String... args) {
        CyclicBarrier barrier = new CyclicBarrier(5);
        //barrier.await()

        CountDownLatch countDownLatch = new CountDownLatch(3);

    }
}
