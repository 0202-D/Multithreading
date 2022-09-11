package task2;

import java.util.concurrent.Callable;

/**
 * @author Dm.Petrov
 * DATE: 10.09.2022
 */
public class MessageCounter implements Callable<Integer> {
    private String name;

    public MessageCounter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer call() throws Exception {
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            Thread.sleep(2500);
            System.out.println("I am " + getName() + " Everybody Hi!");
            counter++;
        }
        return counter;
    }
}

