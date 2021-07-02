package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavour;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

import static be.intecbrussel.eatables.Flavour.*;
import static be.intecbrussel.eatables.Flavour.STRACIATELLA;

public class IceCreamCarApp {

    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.4, 3.0, 2.5);
        Stock stock = new Stock(3, 3, 10, 10);
        IceCreamSeller iceCream = new IceCreamCar(priceList, stock);
        Eatable[] eatables = new Eatable[7];

        eatables[0] = iceCream.orderIceRocket();
        eatables[1] = iceCream.orderIceRocket();
        eatables[2] = iceCream.orderMagnum(MagnumType.BLACK_CHOCOLATE);
        eatables[3] = iceCream.orderMagnum(MagnumType.APINENUTS);
        eatables[4] = iceCream.orderCone(new Flavour[] {CHOCOLATE, BANANA});
        eatables[5] = iceCream.orderCone(new Flavour[] {LEMON, MOKKA});
        eatables[6] = iceCream.orderCone(new Flavour[] {STRACIATELLA, STRACIATELLA});

        for (Eatable e : eatables) {
            try {
                e.eat();
            } catch (NoMoreIceCreamException message) {
                message.getMessage();
            }
        }
        String profit = "your profit is %.2f";
        System.out.printf(profit, iceCream.getProfit());
    }
}
