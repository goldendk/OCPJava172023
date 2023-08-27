package chapter23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockingMain {
    static Lock lock = new ReentrantLock(true);
    public static void main(String... args) throws InterruptedException {

        new Thread(LockingMain::foo, "t1").start();
        new Thread(LockingMain::foo, "t2").start();
        new Thread(LockingMain::foo, "t3").start();
        Thread.sleep(250);
    }

    private static void bar(){
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
        readWriteLock.writeLock().lock();
    }

    private static void foo(){

        System.out.println(Thread.currentThread().getName() + " before lock()");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " after lock()");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(Thread.currentThread().getName() + " Before unlock()");
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " After unlock()");
        }
    }
}
