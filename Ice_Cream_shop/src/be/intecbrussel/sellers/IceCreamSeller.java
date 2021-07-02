package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{

    //return Cone value, with Enum Flavours of the ball
    Cone orderCone(Flavour[] flavours);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType magnumType);

}

