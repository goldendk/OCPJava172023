package chapter23;

import java.util.concurrent.*;

public class Chapter23Main {

    public static void main(String... args) throws InterruptedException {
        TimeUnit days = TimeUnit.DAYS;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int i = threadLocalRandom.nextInt(0, 10);


        Executor executor = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorService = null;
        ThreadPoolExecutor threadPoolExecutor = null;
        ForkJoinPool forkJoinPool = null;


        SimpleExecutor simpleExecutor = new SimpleExecutor();
        simpleExecutor.execute(()-> System.out.println("Running in simple executor."));

       //shutdown
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.submit(()-> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                e.printStackTrace();
            }
        });
        Thread.sleep(100);
        executorService1.shutdownNow();
        System.out.println(executorService1.isShutdown());

        executorService1.shutdown();
        System.out.println(executorService1.isShutdown());

        //await
        ExecutorService executorService2 = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService2.execute(()-> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("executorservice2 interrupt");
            }
        });
        Thread.sleep(100);
        boolean b = executorService2.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println("executorService2 awaitTermination: " + b);

        // futures
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
        Future<?> future3 = executorService3.submit(() -> {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("interrupt in executorService3");
            }
        });

        Thread.sleep(50);
        boolean cancel = future3.cancel(true);
        System.out.println("Future was cancelled: " + cancel);

        executorService3.shutdown();

        ExecutorService executorService4 = Executors.newSingleThreadExecutor();


        Thread.sleep(50);
        executorService4.shutdown();

        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService1.scheduleAtFixedRate(()-> System.out.println("running"), 10, 20, TimeUnit.MILLISECONDS);

        //scheduledExecutorService1.scheduleWithFixedDelay()

        Thread.sleep(160);
        scheduledExecutorService1.shutdown();



    }

    private static class SimpleExecutor implements Executor {

        @Override
        public void execute(Runnable command) {
            Thread t = new Thread(command);
            t.start();
        }
    }
}
