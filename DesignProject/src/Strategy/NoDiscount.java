package Strategy;

import Strategy.DiscountTypes;

public class NoDiscount implements DiscountTypes {

    @Override
    public double discount(double price) {
        return price;
    }
}
