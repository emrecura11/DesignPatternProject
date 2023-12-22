package Client;

import Client.TravelPlanner;

public class AnkaraTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public AnkaraTour(String companyName, double companyPrice){
        this.price = companyPrice;
        this.setDescription(companyName + " to Ankara with");
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