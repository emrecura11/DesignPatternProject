package Client;

import Client.TravelPlanner;

public class DenizliTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public DenizliTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.setDescription(companyName + " to Denizli with");
    }
    @Override
    public double price() {
        return this.price;
    }


    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}