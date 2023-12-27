package Client;

import Strategy.NoDiscount;

public class DenizliTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public DenizliTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription("Your travel plan has been created with a 0% discount.\n"+companyName + ": from Antalya to Denizli with");
        setDiscount(new NoDiscount());

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