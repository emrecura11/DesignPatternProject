package Client;

import Client.TravelPlanner;

public class EskisehirTour extends TravelPlanner {

    String companyName = "Unknown Company";
    public EskisehirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.setDescription(companyName + " to Eskisehir with");
    }
    @Override
    public double price() {
        return 180.0;
    }


    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}

