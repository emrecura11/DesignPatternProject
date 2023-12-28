package Client;

import Strategy.DiscountTypes;

// Abstract Product
public abstract class TravelPlanner {
    private String description = "Unknown description";
    public DiscountTypes discount;
    public double price;


    public String setDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public  double price(){
        return  this.price;
    }

    public DiscountTypes getDiscount() {
        return discount;
    }

    public  void applyDiscount(TravelPlanner travelPlanner){
        this.price = this.discount.discount(travelPlanner.price());
    }

    public void setDiscount(DiscountTypes discount) {
        this.discount = discount;
    }

}