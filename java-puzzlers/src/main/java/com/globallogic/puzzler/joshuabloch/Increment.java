package com.globallogic.puzzler.joshuabloch;

public class Increment { // Joshua Bloch's Puzzlers. Puzzle 25: Increment Increment. Easy, Theoretical

    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);
    }
}
