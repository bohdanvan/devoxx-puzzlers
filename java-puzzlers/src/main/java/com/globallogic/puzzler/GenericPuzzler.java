package com.globallogic.puzzler;

import java.util.ArrayList;
import java.util.List;

public class GenericPuzzler { // Hard, Theoretical

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(10, 20));
        addHello(list);
        System.out.println(list);
    }

    private static void addHello(List list) {
        list.add("Hello");
    }
}
