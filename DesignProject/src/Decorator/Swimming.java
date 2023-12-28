package Decorator;

import Client.TravelPlanner;

public class Swimming extends ActivityDecorator{
    private TravelPlanner travelPlanner;
    private double swimmingPrice;

    public Swimming(TravelPlanner travelPlanner, double swimmingPrice) {
        this.travelPlanner = travelPlanner;
        this.swimmingPrice = swimmingPrice;
        setDiscount(travelPlanner.discount);

    }
    @Override
    public String setDescription() {
        return travelPlanner.setDescription() + ", Swimming";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.swimmingPrice;
    }
}
