package Decorator;

import Client.TravelPlanner;

public class HotAirBalloon extends ActivityDecorator{
    private TravelPlanner travelPlanner;
    private double hotAirBalloonPrice;

    public HotAirBalloon(TravelPlanner travelPlanner, double hotAirBalloonPrice) {
        this.travelPlanner = travelPlanner;
        this.hotAirBalloonPrice = hotAirBalloonPrice;
    }
    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + " ,Swimming";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.hotAirBalloonPrice;
    }
}
