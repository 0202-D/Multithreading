package task1;

/**
 * @author Dm.Petrov
 * DATE: 10.09.2022
 */
class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("I am " + getName() + " Everybody Hi!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s completed\n", getName());
        }
    }
}

