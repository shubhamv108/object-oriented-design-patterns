package templatemethod;

public class PackageA extends AbstractTrip {
    @Override
    public void doComingTransport() {
        System.out.println("PackageA-ComingTransport");
    }

    @Override
    public void doDayA() {
        System.out.println("PackageA-DayA");
    }

    @Override
    public void doDayB() {
        System.out.println("PackageA-DayB");
    }

    @Override
    public void doDayC() {
        System.out.println("PackageA-DayC");
    }

    @Override
    public void doReturningTransport() {
        System.out.println("PackageA-ReturnTransport");
    }
}
