package com.globallogic.puzzler;

import java.util.LinkedList;
import java.util.List;

public class ForEachPuzzler { // Medium, Theoretical

    public static void main(String[] args) {
        var list = new LinkedList<>(List.of(10, 20, 30));
        for (int elem : list.subList(1, 3)) {
            list.addFirst(elem);
        }
        System.out.println(list);
    }
}
