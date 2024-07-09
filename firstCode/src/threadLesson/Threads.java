package threadLesson;
//class Hi extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class Hello extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class Threads {

    public static void run(String val) {
        for (int i = 0; i < 5; i++) {
            System.out.println(val);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//        Hi h = new Hi();
//        Hello h1 = new Hello();

//        h.setPriority(Thread.MIN_PRIORITY);
//        h1.setPriority(Thread.MAX_PRIORITY);

//        OPTIMIZE THE ABOVE CLASSES WITHOUT USING CLASSES
        Runnable obj = () -> Threads.run("Hi");
        Runnable obj1 = () -> Threads.run("Hello");

        Thread h = new Thread(obj);
        Thread h1 = new Thread(obj1);

        h.start();
        h1.start();
//        {
//            try {
//                Thread.sleep(3);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
