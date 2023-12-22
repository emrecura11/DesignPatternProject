package Strategy;

import Strategy.DiscountTypes;

public class FivePercentDiscount implements DiscountTypes {

    @Override
    public double discount(double price) {
        double discountAmount = price * 0.05;
        return price - discountAmount;
    }
}
