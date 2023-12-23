package Client;

import Strategy.DiscountTypes;

// Abstract Product
public abstract class TravelPlanner {
    private String description = "Unknown description";
    public DiscountTypes discount;
    public double price;


    public String getDescription() {
        return description;
    }


    public void getDescription(String description) {
        this.description = description;
    }

    public  double price(){
        return  this.price;
    }

    public DiscountTypes getDiscount() {
        return discount;
    }

    public  void applyDiscount(DiscountTypes discount, double price){
        this.price = discount.discount(price);
    }

    public void setDiscount(DiscountTypes discount) {
        this.discount = discount;
    }

}