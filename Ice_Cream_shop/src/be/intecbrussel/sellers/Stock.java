package be.intecbrussel.sellers;

public class Stock {

    int iceRockets;
    int cones;
    int balls;
    int magni;

    public Stock(int iceRockets, int cones, int balls, int magni) {
        setCones(cones);
        setBalls(balls);
        setIceRockets(iceRockets);
        setMagni(magni);
    }

//Create getter an setter
    //a negative value control in setter methods

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets < 0 ? -iceRockets : iceRockets;
    }

    public void setCones(int cones) {
        this.cones = cones < 0 ? -cones : cones;
    }

    public void setBalls(int balls) {
        this.balls = balls < 0 ? -balls : balls;
    }

    public void setMagni(int magni) {
        this.magni = magni < 0 ? -magni : magni;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getMagni() {
        return magni;
    }

}
