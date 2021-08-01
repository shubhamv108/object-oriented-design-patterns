package flyweight;

public class Location {

    private final int x;
    private final int y;

    private Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public static LocationBuilder builder() {
        return new LocationBuilder();
    }

    public static class LocationBuilder {
        private int x;
        private int y;

        public LocationBuilder withX(final int x) {
            this.x = x;
            return this;
        }

        public LocationBuilder withY(final int y) {
            this.y = y;
            return this;
        }

        public Location build() {
            return new Location(this.x, this.y);
        }

    }

}
