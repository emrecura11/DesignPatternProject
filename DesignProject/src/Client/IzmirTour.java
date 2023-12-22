package Client;

import Client.TravelPlanner;

public class IzmirTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public IzmirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.setDescription(companyName + " to Izmir with");
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
