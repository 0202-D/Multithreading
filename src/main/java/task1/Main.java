package task1;

/**
 * @author Dm.Petrov
 * DATE: 10.09.2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("create threads ...");
        ThreadGroup myGroup = new ThreadGroup("myThreads");
        MyThread thread1 = new MyThread(myGroup, "thread 1");
        MyThread thread2 = new MyThread(myGroup, "thread 2");
        MyThread thread3 = new MyThread(myGroup, "thread 3");
        MyThread thread4 = new MyThread(myGroup, "thread 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("complete threads");
        myGroup.interrupt();


    }
}
