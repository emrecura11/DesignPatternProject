package Decorator;
import Client.TravelPlanner;


public class MuseumTour extends ActivityDecorator {
    private TravelPlanner travelPlanner;
    private double museTourPrice;

    public MuseumTour(TravelPlanner travelPlanner, double museTourCost) {
        this.travelPlanner = travelPlanner;
        this.museTourPrice = museTourCost;
    }

    @Override
    public double price() {

        return travelPlanner.price() + museTourPrice;
    }

    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + " ,Muse Tour";
    }
}
