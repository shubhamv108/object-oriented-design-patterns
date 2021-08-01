package flyweight;

public interface ISoldierFlyweight extends IFlyweight {

    void move(int currentLocationX, int currentLocationY, int newLocationX, int newLocationY);

}
