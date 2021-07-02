package be.intecbrussel.eatables;

import java.util.Arrays;

//cone class
public class Cone implements Eatable {

    //instance variable of array of Enum values
    Flavour [] ball;

    //Constructor created
    public Cone() {

    }

    public Cone(Flavour[] flavour) {
        this.ball = flavour;
    }

    //eat method to print a different flavours balls with a cone
    @Override
    public void eat() {
        System.out.println("Please have this cone Ice cream with " +
                Arrays.toString(ball) + " Flavour");
    }
}
