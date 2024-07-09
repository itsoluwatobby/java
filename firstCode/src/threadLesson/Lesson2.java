package threadLesson;

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class Lesson2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj1);

        thread1.start();
        thread2.start();

//        to make the MAIN thread wait for this two threads to complete
//        before execution, use .join() on both child threads
        thread1.join();
        thread2.join();

        System.out.println(c.count);
    }
}
