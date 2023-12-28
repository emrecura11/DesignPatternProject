package Decorator;

import Client.TravelPlanner;

public class PartyNight extends ActivityDecorator{
    private TravelPlanner travelPlanner;
    private double partNightPrice;

    public PartyNight(TravelPlanner travelPlanner, double partNightPrice) {
        this.travelPlanner = travelPlanner;
        this.partNightPrice = partNightPrice;
        setDiscount(travelPlanner.discount);

    }
    @Override
    public String setDescription() {
        return travelPlanner.setDescription() + ", Party Night";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.price;
    }
}
