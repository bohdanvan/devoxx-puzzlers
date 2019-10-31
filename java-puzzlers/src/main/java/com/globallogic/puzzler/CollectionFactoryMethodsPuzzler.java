package com.globallogic.puzzler;

import java.util.List;
import java.util.Map;

public class CollectionFactoryMethodsPuzzler { // Medium, Practical

    public static void main(String[] args) {
        var devoxxList = List.of("Devoxx", null, "Devoxx");
        System.out.println(devoxxList.size());

        var devoxxMap = Map.of(
                "conference", "Devoxx",
                "conference", "Devoxx",
                null, "Devoxx",
                "conference", null
        );
        System.out.println(devoxxMap.size());
    }
}
