package com.globallogic.puzzler;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;

import java.util.TreeMap;
import java.util.stream.Stream;

public class StreamPipelinePuzzler { // Medium, Practical

    public static void main(String[] args) {
        var res = Stream.of(
                "Apache",
                "Verte.x",
                "Jetty",
                "Android"
        ).collect(groupingBy(String::length, TreeMap::new, mapping(s -> s.substring(0, 1), joining())));

        System.out.println(String.join("", res.values()));
    }
}
