package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavour;
import be.intecbrussel.eatables.MagnumType;
import sellers.IceCreamSalon;
import sellers.IceCreamSeller;
import sellers.PriceList;

public class IceCreamApp{

    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.4, 3.0, 2.5);
        IceCreamSeller iceCream = new IceCreamSalon(priceList);
        Eatable[] eatables = new Eatable[6];

        eatables[0] = iceCream.orderIceRocket();
        eatables[1] = iceCream.orderMagnum(MagnumType.WHITE_CHOCOLATE);
        eatables[2] = iceCream.orderMagnum(MagnumType.APINENUTS);
        eatables[3] = iceCream.orderCone(new Flavour[]{Flavour.CHOCOLATE, Flavour.BANANA});
        eatables[4] = iceCream.orderCone(new Flavour[]{Flavour.LEMON, Flavour.MOKKA});
        eatables[5] = iceCream.orderCone(new Flavour[]{Flavour.STRACIATELLA,Flavour.STRACIATELLA});

        for (Eatable e : eatables) {
            if (e != null) {
                e.eat();
            }
        }
        System.out.println(iceCream);
    }
}
