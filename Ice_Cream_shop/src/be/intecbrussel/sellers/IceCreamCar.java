package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    //create instance variable

    PriceList priceList;
    Stock stock;
    double profit =0;
    double totalPrice =0;


    //Constructor

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {
        this.prepareCone(flavours);
        return new Cone(flavours);
    }

    @Override
    public IceRocket orderIceRocket() {
        this.prepareIceRocket();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        this.prepareMagnum(magnumType);
        return magnum;
    }

    //preparing cone within stocks
    private Cone prepareCone(Flavour[] flavours) throws NoMoreIceCreamException{

        Cone cone = new Cone(flavours);

        if (stock.getCones() <= 0 || stock.getBalls() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more Ice cream");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more Ice Cream!");
            }

        } else {
            totalPrice += priceList.getBallPrice() * flavours.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavours.length);
        }
        return cone;
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException{

        IceRocket iceRocket = new IceRocket();

        if (stock.getIceRockets() <=0) {
            try {
                throw new NoMoreIceCreamException("No More ice rocket");
            }catch (NoMoreIceCreamException nmi) {
                System.out.println("No More Ice Rocket");
            }

        } else {
            totalPrice += priceList.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets()-1);
        }
        return iceRocket;
    }

    private Magnum prepareMagnum(MagnumType magnumType) {

        Magnum magnum = new Magnum(magnumType);

        if (stock.getMagni() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more Magnum");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more Magnum");
            }

        } else {
            totalPrice += priceList.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets() - 1);
        }
        return magnum;
    }

    @Override
    public double getProfit() {
        profit = 1.2 * totalPrice;
        return profit;
    }

}
