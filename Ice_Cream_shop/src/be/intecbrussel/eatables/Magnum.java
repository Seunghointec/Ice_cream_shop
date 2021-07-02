package be.intecbrussel.eatables;

//magnum class
public class Magnum implements Eatable{

    MagnumType type;

    //constructor
    public Magnum() {
        this(MagnumType.BLACK_CHOCOLATE);
    }

    public Magnum(MagnumType magnumType) {
        type = magnumType;
    }

    @Override
    public void eat() {
        System.out.println("please have a " +getType());
    }

    //getter
    public MagnumType getType() {
        return type;
    }

}
