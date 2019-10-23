package com.globallogic.puzzler;

import java.util.stream.Stream;

public class ParallelSteamPuzzler { // Medium, Theoretical

    public static void main(String[] args) {
        var res = Stream.of("8", "11", "13").parallel().reduce("Java ", String::concat);
        System.out.println(res);
    }
}
