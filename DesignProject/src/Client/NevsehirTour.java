package Client;

import Strategy.FivePercentDiscount;
import Strategy.TenPercentDiscount;

public class NevsehirTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public NevsehirTour(String companyName, double companyPrice){
        this.price = companyPrice;
        this.getDescription("Your travel plan has been created with a 10% discount.\n"+companyName + ": Antalya to Nevsehir with");
        setDiscount(new FivePercentDiscount());

      }
    @Override
    public double price() {
        return this.price;
    }

    @Override
    public void getDescription(String description) {
        super.getDescription(description);
    }
}