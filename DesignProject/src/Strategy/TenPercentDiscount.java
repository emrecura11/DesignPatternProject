package Strategy;

public class TenPercentDiscount implements DiscountTypes{
    @Override
    public double discount(double price) {
        double discountAmount = price * 0.1;
        return price - discountAmount;    }
}
