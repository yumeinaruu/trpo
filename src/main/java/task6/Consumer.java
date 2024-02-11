package task6;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread {
    Semaphore semaphore;
    int num = 0;
    int id;

    Consumer(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3) {
                semaphore.acquire();
                System.out.println("Consumer " + id + " is using checkout");
                sleep(3000);
                num++;
                System.out.println("Consumer " + id + " has left checkout");
                semaphore.release();
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
