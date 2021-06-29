package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    Flavour [] ball;

    public Cone() {

    }

    public Cone(Flavour[] flavour) {
        this.ball = flavour;
    }

    @Override
    public void eat() {
        System.out.println("Please have this cone Ice cream with a " +
                Arrays.toString(ball) + "Flavour");
    }
}
