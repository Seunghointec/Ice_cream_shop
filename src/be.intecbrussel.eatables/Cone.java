package be.intecbrussel.eatables;

import be.intecbrussel.sellers.IceCreamSeller;

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

        for (int i =0; i< ball.length; i++) {
            if (ball.length == 1) {
                System.out.println("please have a " + Arrays.toString(Flavour.values()));
            }
            if (ball.length < 3) {
                System.out.println("please have a " + Arrays.toString(Flavour.values()));
            }
        }
    }
}
