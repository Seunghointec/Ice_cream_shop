package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

import java.util.Formatter;

public class IceCreamSalon implements IceCreamSeller {

    //instance variable of ice cream prices

    PriceList priceList;
    double totalPrice;
    double totalProfit;

    //constructor to recall methods from the priceList class

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    //getProfit method calculates totalProfit

    public double getProfit() {
        totalProfit = 1.2* totalPrice;
        return totalProfit;
    }

    //orderMethod instantiated cone object and
    // uses cone class method of  getting the price of balls

    @Override
    public Cone orderCone(Flavour[] flavours) {
        Cone cone = new Cone(flavours);
        totalPrice +=  priceList.getBallPrice()* flavours.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalPrice +=  priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        totalPrice += priceList.getMagnumStandardPrice(magnumType);
        return magnum;
    }

    @Override
    public String toString() {

        Formatter formatter = new Formatter();
        String profit = "your profit is %.2f";
        formatter.format(profit, getProfit());

        return formatter.toString();
    }
}
