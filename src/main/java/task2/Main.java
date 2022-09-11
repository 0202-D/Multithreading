package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Dm.Petrov
 * DATE: 10.09.2022
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MessageCounter msc1 = new MessageCounter("thread1");
        MessageCounter msc2 = new MessageCounter("thread2");
        MessageCounter msc3 = new MessageCounter("thread3");
        MessageCounter msc4 = new MessageCounter("thread4");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<MessageCounter> list = new ArrayList<>();
        list.add(msc1);
        list.add(msc2);
        list.add(msc3);
        list.add(msc4);
        List<Future<Integer>> future = executorService.invokeAll(list);
        printSumCompletedTask(future);
        Integer oneTaskSum = executorService.invokeAny(list);
        System.out.println(oneTaskSum);
        executorService.shutdown();

    }

    private static void printSumCompletedTask(List<Future<Integer>> future) throws InterruptedException, ExecutionException {
        int result = 0;
        for (Future<Integer> future1 : future) {
            result += future1.get();
        }
        System.out.println(result);
    }
}
