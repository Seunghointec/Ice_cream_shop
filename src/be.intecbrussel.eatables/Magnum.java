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
        System.out.println("Please have this be.intecbrussel.eatables.Magnum with a " + Arrays.toString(MagnumType.values()) + "be.intecbrussel.eatables.Flavour");
    }

    public MagnumType getType() {
        return type;
    }
}
