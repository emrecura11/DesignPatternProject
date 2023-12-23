package Decorator;

import Client.TravelPlanner;

public class PartyNight extends ActivityDecorator{
    private TravelPlanner travelPlanner;
    private double partNightPrice;

    public PartyNight(TravelPlanner travelPlanner, double partNightPrice) {
        this.travelPlanner = travelPlanner;
        this.partNightPrice = partNightPrice;
    }
    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + ", Party Night";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.price;
    }
}
