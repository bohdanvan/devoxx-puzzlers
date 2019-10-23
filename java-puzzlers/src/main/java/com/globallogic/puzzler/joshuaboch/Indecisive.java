package com.globallogic.puzzler.joshuaboch;

public class Indecisive { // Joshua Bloch's Puzzlers. Puzzle 36: Indecisive. Easy, Theoretical

    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
