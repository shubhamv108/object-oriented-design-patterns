package flyweight;

/**
 * Sharing to support a large number of objects that have part of their internal state in common
 * where the other part of state can vary.
 *
 * Flyweight pattern saves memory by sharing flyweight objects among clients.
 *
 *
 *
 * SoldierClient uses same Soldier object
 * because of which saved memory costs of creating 5 Soldier representations
 */
public class WarGameFlyweightDemo {

    public static void main(String[] args) {
        SoldierClient warSoldiers [] ={
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient()
        };

        warSoldiers[0].move(17, 2112);
        warSoldiers[1].move(137, 112);
    }

}
