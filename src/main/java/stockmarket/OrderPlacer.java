package stockmarket;

import java.util.List;

public class OrderPlacer {

    private OrderStrategy strategy;

    public OrderPlacer(final OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(final OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void placeOrder(final List<Double> prices) {
        this.strategy.apply(prices);
    }
}
