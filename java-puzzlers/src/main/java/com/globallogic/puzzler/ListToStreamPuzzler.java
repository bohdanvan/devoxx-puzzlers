package com.globallogic.puzzler;

import java.util.ArrayList;

public class ListToStreamPuzzler { // Easy, Theoretical/Practical

    public static void main(String[] args) {
        var speakers = new ArrayList<String>();
        speakers.add("Mikalai Alimenkou");
        speakers.add("Josh Long");

        var stream = speakers.stream();
        speakers.add("Cay Horstmann");

        System.out.println(stream.count());
    }
}
