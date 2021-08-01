package flyweight;

/**
 * Heavyweight soldier object, client for flyweight
 *
 * this object is responsible for maintaining the state that is extrinsic to the flyweight
 */
public class SoldierClient {

    private final Soldier soldier = SoldierFactory.get();
    private int currentLocationX; // Extrinsic state of soldier flyweight
    private int currentLocationY;

    public void move(final int newLocationX, final int newLocationY) {
        this.soldier.move(this.currentLocationX, this.currentLocationY, newLocationX, newLocationY);
        this.currentLocationX = newLocationX;
        this.currentLocationY = newLocationY;
    }

}
