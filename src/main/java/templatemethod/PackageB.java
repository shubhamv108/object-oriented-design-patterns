package templatemethod;

public class PackageB extends AbstractTrip {
    @Override
    public void doComingTransport() {
        System.out.println("PackageB-ComingTransport");
    }

    @Override
    public void doDayA() {
        System.out.println("PackageB-DayA");
    }

    @Override
    public void doDayB() {
        System.out.println("PackageB-DayB");
    }

    @Override
    public void doDayC() {
        System.out.println("PackageB-DayC");
    }

    @Override
    public void doReturningTransport() {
        System.out.println("PackageB-ReturnTransport");
    }
}
