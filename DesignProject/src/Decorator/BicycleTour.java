package Decorator;

import Client.TravelPlanner;

public class BicycleTour extends ActivityDecorator{

    private TravelPlanner travelPlanner;
    private double bicycleTourPrice;

    public BicycleTour(TravelPlanner travelPlanner, double bicycleTourPrice) {
        this.travelPlanner = travelPlanner;
        this.bicycleTourPrice = bicycleTourPrice;
        setDiscount(travelPlanner.discount);
    }
    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + ", Bicycle Tour";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.bicycleTourPrice;
    }
}
