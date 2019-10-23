package com.globallogic.puzzler.joshuaboch;

public class Workout { // Joshua Bloch's Puzzlers. Puzzle 45: Exhausting Workout. Very Hard, Theoretical

    public static void main(String[] args) {
        workHard();
        System.out.println("It’s nap time.");
    }

    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }
}
