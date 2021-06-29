package be.intecbrussel.eatables;

import java.util.Arrays;

public class Magnum implements Eatable{

    MagnumType type;

    public Magnum() {

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Please have this Magnum with a " + type + "Flavour");
    }

    public MagnumType getType() {
        return type;
    }
}
