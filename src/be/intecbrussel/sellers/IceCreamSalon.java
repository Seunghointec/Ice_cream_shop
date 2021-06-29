package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    PriceList priceList;
    double totalProfit;


    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {
        totalProfit =+ priceList.getBallPrice()* flavours.length;
        return new Cone(flavours);
    }

    public Cone prepareCone(Flavour[] flavours) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit =+ priceList.getRocketPrice();
        return new IceRocket();
    }

    public IceRocket prepareIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        totalProfit =+ priceList.getRocketPrice();
        return new Magnum();
    }

    public Magnum prepareMagnum(MagnumType type) {
        return null;
    }

}
