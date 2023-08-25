package chapter23;

import java.util.concurrent.*;

public class Chapter23Main {

    public static void main(String... args) {
        TimeUnit days = TimeUnit.DAYS;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int i = threadLocalRandom.nextInt(0, 10);


        Executor executor = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorService = null;
        ThreadPoolExecutor threadPoolExecutor = null;
        ForkJoinPool forkJoinPool = null;

    }
}
