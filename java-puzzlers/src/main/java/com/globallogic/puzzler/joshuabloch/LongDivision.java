package com.globallogic.puzzler.joshuabloch;

public class LongDivision { // Joshua Bloch's Puzzlers. Puzzle 3: Long Division. Medium, Theoretical

    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
