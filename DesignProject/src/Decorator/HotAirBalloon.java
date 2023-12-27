package Decorator;

import Client.TravelPlanner;

public class HotAirBalloon extends ActivityDecorator{
    private TravelPlanner travelPlanner;
    private double hotAirBalloonPrice;

    public HotAirBalloon(TravelPlanner travelPlanner, double hotAirBalloonPrice) {
        this.travelPlanner = travelPlanner;
        this.hotAirBalloonPrice = hotAirBalloonPrice;
        setDiscount(travelPlanner.discount);

    }
    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + ", Hot Air Balloon Tour";
    }

    @Override
    public double price() {
        return travelPlanner.price() + this.hotAirBalloonPrice;
    }
}
