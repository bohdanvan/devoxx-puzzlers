package com.globallogic.puzzler;

public class InitializationPuzzler { // Medium, Theoretical

    public static void main(String[] args) {
        Devoxx devoxx = new Devoxx();
        System.out.println("name = " + devoxx.NAME);
    }
}

class Devoxx {

    public static final String NAME = "Devoxx";

    static {
        System.out.println("static");
    }

    {
        System.out.println("init block");
    }

    public Devoxx() {
        System.out.println("constructor");
    }
}
