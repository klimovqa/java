package ru.klimov.java.course.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {

    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = value/10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> future = executorService.submit(task);
            futureResults.add(future);
        }
        executorService.shutdown();
        System.out.println("Total sum = " + futureResults.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        // обработка исключения, например, возврат значения по умолчанию
                        return 0L;
                    }
                })
                .reduce(sum, Long::sum));
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i < to; i++) {
            localSum += i;
        }
        System.out.println("Sum from=" + from + " to=" + to + " = " + localSum);
        return localSum;
    }
}
