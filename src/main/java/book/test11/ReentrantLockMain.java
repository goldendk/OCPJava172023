package book.test11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockMain extends Thread {
    public static Lock lock = new ReentrantLock();

    public ReentrantLockMain(String name) {
        super(name);
    }

    static StringBuilder data = new StringBuilder("foo");

    public void run() {
        if (lock.tryLock()) {
            try {
                lock.lock();
                data.append("hello");
            } finally {
                lock.unlock();
                //lock.unlock(); needed since tryLock and Lock claims the lock twice.
            }
        }
    }


}

class Foo {
    public static void main(String args[]) throws Exception {
        ReentrantLockMain t1 = new ReentrantLockMain("T1");
        t1.start();
        try {
            Thread.sleep(200);
            t1.lock.lock();
            System.out.println(t1.data);
        } finally {
            t1.lock.unlock();
        }
    }

}


