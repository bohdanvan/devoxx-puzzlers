package com.globallogic.puzzler.joshuabloch;

public class Reluctant { // Joshua Bloch's Puzzlers. Puzzle 40: The Reluctant Constructor. Medium, Theoretical

    private Reluctant internalInstance = new Reluctant();

    public Reluctant() throws Exception {
        throw new Exception("I’m not coming out");
    }

    public static void main(String[] args) {
        try {
            Reluctant b = new Reluctant();
            System.out.println("Surprise!");
        } catch (Exception ex) {
            System.out.println("I told you so");
        }
    }
}
