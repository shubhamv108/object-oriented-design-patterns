package flyweight;

public class Soldier implements ISoldierFlyweight {

    private final SoldierIntrinsicState soldierIntrinsicState;

    private Soldier(final SoldierIntrinsicState soldierIntrinsicState) {
        this.soldierIntrinsicState = soldierIntrinsicState;
    }

    @Override
    public void move(final int currentLocationX, final int currentLocationY,
                     final int newLocationX, final int newLocationY) {
        System.out.println(String.format(" previous Location: { %s, %s }, new location: { %s, %s } ",
                currentLocationX, currentLocationY, newLocationX, newLocationY));
    }

    public static SoldierFlyWeightImplementationBuilder builder () {
        return new SoldierFlyWeightImplementationBuilder();
    }

    public static class SoldierFlyWeightImplementationBuilder {
        private SoldierIntrinsicState soldierIntrinsicState;

        public SoldierFlyWeightImplementationBuilder withSoldierIntrinsicState(final SoldierIntrinsicState soldierIntrinsicState) {
            this.soldierIntrinsicState = soldierIntrinsicState;
            return this;
        }

        public Soldier build() {
            return new Soldier(this.soldierIntrinsicState);
        }
    }

}
