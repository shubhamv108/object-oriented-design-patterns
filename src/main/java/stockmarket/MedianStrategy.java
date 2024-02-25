package stockmarket;

import java.util.List;

public class MedianStrategy implements OrderStrategy {
    @Override
    public void apply(final List<Double> prices) {
        System.out.println("Median");
    }
}
