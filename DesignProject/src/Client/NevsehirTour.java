package Client;

import Strategy.FivePercentDiscount;

public class NevsehirTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public NevsehirTour(String companyName, double companyPrice){
        this.price = companyPrice;
        this.setDescription("Your travel plan has been created with a 5% discount.\n"+companyName + ": from Antalya to Nevsehir with");
        setDiscount(new FivePercentDiscount());

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