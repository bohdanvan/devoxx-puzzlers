package com.globallogic.puzzler;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SortingPuzzler { // Easy, Practical

    public static void main(String[] args) {
        var s = "21 15 2 01";
        var res = Pattern.compile(" ").splitAsStream(s)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(res);
    }
}
