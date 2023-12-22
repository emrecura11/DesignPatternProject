package Decorator;
import Client.TravelPlanner;

abstract class ActivityDecorator extends TravelPlanner {
    public abstract String getDescription();
    public abstract double price();
}