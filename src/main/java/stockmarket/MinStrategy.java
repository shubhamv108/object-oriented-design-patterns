package stockmarket;

import java.util.List;

public class MinStrategy implements OrderStrategy {
    @Override
    public void apply(final List<Double> prices) {
        System.out.println(prices.stream().mapToDouble(e -> e).min());
    }
}
