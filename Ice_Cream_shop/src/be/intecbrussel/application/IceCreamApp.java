package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

import static be.intecbrussel.eatables.Flavour.*;

public class IceCreamApp{

    public static void main(String[] args) {

        //Two options of setting the price, set() or the instantiation of priceList
        PriceList priceList = new PriceList(1.4, 3.0, 2.5);
        //instantiated the ice cream salon to get the total price and total profit
        IceCreamSalon iceCream = new IceCreamSalon(priceList);
        //Polymorphism of new ice cream list
        Eatable[] eatables = new Eatable[6];

        eatables[0] = iceCream.orderIceRocket();
        eatables[1] = iceCream.orderMagnum(MagnumType.BLACK_CHOCOLATE);
        eatables[2] = iceCream.orderMagnum(MagnumType.APINENUTS);
        eatables[3] = iceCream.orderCone(new Flavour[] {CHOCOLATE, BANANA});
        eatables[4] = iceCream.orderCone(new Flavour[] {LEMON, MOKKA});
        eatables[5] = iceCream.orderCone(new Flavour[] {STRACIATELLA, STRACIATELLA});

        for (Eatable e : eatables) {
            if (e != null) {
                e.eat();
            }
        }
        System.out.println(iceCream);
    }
}
