package sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    PriceList priceList;
    double totalProfit;


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }

    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {
        totalProfit =+ 1.2 *(priceList.getBallPrice()* flavours.length);
        return new Cone(flavours);
    }

    public Cone prepareCone(Flavour[] flavours) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit =+ 1.2 * (priceList.getRocketPrice());
        return new IceRocket();
    }

    public IceRocket prepareIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        totalProfit =+ 1.2 * (priceList.getRocketPrice());
        return new Magnum();
    }

    public Magnum prepareMagnum(MagnumType type) {
        return null;
    }

    @Override
    public String toString() {
        return "IceCreamSalon {" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
