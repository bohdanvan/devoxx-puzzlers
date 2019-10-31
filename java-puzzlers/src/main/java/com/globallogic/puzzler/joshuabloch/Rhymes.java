package com.globallogic.puzzler.joshuabloch;

import java.util.Random;

public class Rhymes { // Joshua Bloch's Puzzlers. Puzzle 23: No Pain, No Gain. Hard, Theoretical

    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuilder word;
        switch (rnd.nextInt(2)) {
            case 1: word = new StringBuilder('P');
            case 2: word = new StringBuilder('G');
            default: word = new StringBuilder('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
