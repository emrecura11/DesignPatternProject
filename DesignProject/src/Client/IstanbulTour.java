package Client;

import Client.TravelPlanner;

public class IstanbulTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public IstanbulTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.setDescription(companyName + " to Istanbul with");
    }
    @Override
    public double price() {
        return this.price;
    }


    @Override
    public void setDescription(String description) {
        super.setDescription(description );
    }
}
