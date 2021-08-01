package flyweight;

public class SoldierFactory {

    // this can be a map
    private static Soldier SOLDIER;

    public static Soldier get() {
        if (SOLDIER == null) {
            synchronized (SoldierFactory.class) {
                if (SOLDIER == null) {
                    SOLDIER = Soldier.builder()
                            .withSoldierIntrinsicState(SoldierIntrinsicState.builder().build())
                            .build();
                }
            }
        }
        return SOLDIER;
    }

}
