package FactoryMethod;

import Client.TravelPlanner;

public abstract class TravelCompanyFactory {

    public abstract TravelPlanner createCityTour(int cityNumber);
}