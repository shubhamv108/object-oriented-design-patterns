package templatemethod;

/**
 * A template method defines an algorithm in a base class using abstract operations
 * that subclasses override to provide concrete behavior.
 */
public class Main {

    public static void main(String[] args) {
        PackageA packageA = new PackageA();
        PackageB packageB = new PackageB();

        packageA.performTrip();
        packageB.performTrip();
    }

}
