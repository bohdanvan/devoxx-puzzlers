package com.globallogic.puzzler;

import java.util.IdentityHashMap;

public class IdentityHashMapPuzzler { // Medium, Theoretical

    public static void main(String[] args) {
        var map = new IdentityHashMap<Object, String>();
        map.put(100, "C++");
        map.put(100, "Java");
        map.put(200, "Python");
        map.put(200, "Kotlin");
        map.put("lang", "Groovy");
        map.put("lang", "Golang");

        System.out.println(map.values());
    }
}
