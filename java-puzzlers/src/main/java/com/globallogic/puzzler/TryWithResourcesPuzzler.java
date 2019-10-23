package com.globallogic.puzzler;

/**
 * @author bvanchuhov
 */
public class TryWithResourcesPuzzler { // Medium, Theoretical/Practical

    public static void main(String[] args) {
        try (var ukraine = new DevoxxConrefence("Ukraine"); var belgium = new DevoxxConrefence("Belgium")) {
            ukraine.run();
            belgium.run();
        } catch (DevoxxException e) {
           e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class DevoxxConrefence implements AutoCloseable {

    private final String country;

    public DevoxxConrefence(String country) {
        this.country = country;
    }

    public void run() {
        System.out.println("Fun at Devoxx " + country);
    }

    @Override
    public void close() throws DevoxxException {
        System.out.println("Devoxx " + country + " is closing");
        throw new DevoxxException(country);
    }
}

class DevoxxException extends Exception {

    public DevoxxException(String country) {
        super("Error in Devoxx " + country);
    }
}
