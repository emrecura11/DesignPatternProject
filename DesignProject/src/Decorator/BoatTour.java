package Decorator;
import Client.TravelPlanner;


// Concrete decorator class for Boat Tour
public  class BoatTour extends ActivityDecorator {
    private TravelPlanner travelPlanner;
    private double boatTourCost;

    public BoatTour(TravelPlanner travelPlanner, double boatTourCost) {
        this.travelPlanner = travelPlanner;
        this.boatTourCost = boatTourCost;
        setDiscount(travelPlanner.discount);

    }

    @Override
    public double price() {
        return travelPlanner.price() + boatTourCost;
    }


    @Override
    public String getDescription() {
        return travelPlanner.getDescription() + ", Boat Tour";
    }


}