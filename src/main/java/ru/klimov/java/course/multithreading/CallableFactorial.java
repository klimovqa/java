package ru.klimov.java.course.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial = new Factorial2(10);
        Future<Integer> future = executorService.submit(factorial);
        executorService.shutdown();
        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}

class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
           throw  new Exception("Illegal Argument");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
