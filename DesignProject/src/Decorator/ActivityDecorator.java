package Decorator;
import Client.TravelPlanner;

abstract class ActivityDecorator extends TravelPlanner {
    public abstract String setDescription();
    public abstract double price();
}