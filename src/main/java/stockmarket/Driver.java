package stockmarket;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        final List<Double> prices = List.of(100.5, 102.0, 98.5, 105.0, 101.0);

        final OrderPlacer placer = new OrderPlacer(new AverageStrategy());
        placer.placeOrder(prices);

        placer.setStrategy(new MinStrategy());
        placer.placeOrder(prices);

        placer.setStrategy(new MaxStrategy());
        placer.placeOrder(prices);

        placer.setStrategy(new MedianStrategy());
        placer.placeOrder(prices);
    }
}
