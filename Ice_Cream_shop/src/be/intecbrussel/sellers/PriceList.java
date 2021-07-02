package be.intecbrussel.sellers;


import be.intecbrussel.eatables.MagnumType;

public class PriceList {

    //instance variable of ice cream prices
    double ballPrice;
    double rocketPrice;
    double magnumStandardPrice;

    //constructor of various price
    public PriceList() {
        this(0, 0, 0);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    //setting the ice cream price
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice < 0 ? -ballPrice : ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice < 0 ? -rocketPrice : rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice < 0
                ? -magnumStandardPrice : magnumStandardPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getMagnumStandardPrice(MagnumType magnumType) {

        if (magnumType == MagnumType.APINENUTS) {
            return magnumStandardPrice * 1.5;
        } else {
            return magnumStandardPrice;
        }
    }
}
