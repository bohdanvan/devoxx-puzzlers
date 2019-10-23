package com.globallogic.puzzler;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadsPuzzler { // Hard, Practical

    public static void main(String[] args) throws InterruptedException {
        var executorService = Executors.newFixedThreadPool(2);
        try {
            System.out.println(countLetters(executorService, List.of("AAA BBB CCC", "DD EE FFFF")));
        } finally {
            executorService.shutdown();
        }
    }

    private static int countLetters(ExecutorService executorService, List<String> sentences) throws InterruptedException {
        var tasks = sentences.stream()
                .<Callable<Integer>>map(sentence -> () -> countLetters(executorService, sentence))
                .collect(Collectors.toList());

        return executorService.invokeAll(tasks).stream()
                .map(ThreadsPuzzler::silentGet)
                .mapToInt(x -> x)
                .sum();
    }

    private static int countLetters(ExecutorService executorService, String sentence) throws InterruptedException {
        List<Callable<Integer>> tasks = Stream.of(sentence.split(" "))
                .<Callable<Integer>>map(word -> () -> countLetters(word))
                .collect(Collectors.toList());

        return executorService.invokeAll(tasks).stream()
                .map(ThreadsPuzzler::silentGet)
                .mapToInt(x -> x)
                .sum();
    }

    private static int countLetters(String word) {
        return word.length();
    }

    private static <T> T silentGet(Future<T> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
