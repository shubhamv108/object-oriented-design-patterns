package flyweight;

public class SoldierIntrinsicState {

    private SoldierIntrinsicState() {}

    public static SoldierIntrinsicStateBuilder builder() {
        return new SoldierIntrinsicStateBuilder();
    }

    public static class SoldierIntrinsicStateBuilder {

        public SoldierIntrinsicState build() {
            return new SoldierIntrinsicState();
        }

    }

}
