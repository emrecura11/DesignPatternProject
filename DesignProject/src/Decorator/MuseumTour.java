package Decorator;
import Client.TravelPlanner;


public class MuseumTour extends ActivityDecorator {
    private TravelPlanner travelPlanner;
    private double museTourPrice;

    public MuseumTour(TravelPlanner travelPlanner, double museTourCost) {
        this.travelPlanner = travelPlanner;
        this.museTourPrice = museTourCost;
        setDiscount(travelPlanner.discount);
    }

    @Override
    public double price() {

        return travelPlanner.price() + museTourPrice;
    }

    @Override
    public String setDescription() {
        return travelPlanner.setDescription() + ", Museum Tour";
    }
}
