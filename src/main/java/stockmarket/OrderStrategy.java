package stockmarket;

import java.util.List;

public interface OrderStrategy {
    void apply(List<Double> prices);
}
