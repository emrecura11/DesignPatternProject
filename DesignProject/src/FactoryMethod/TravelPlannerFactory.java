package FactoryMethod;

import Client.TravelPlanner;

public abstract class TravelPlannerFactory {

    public abstract TravelPlanner createCityTour(int cityNumber);
}