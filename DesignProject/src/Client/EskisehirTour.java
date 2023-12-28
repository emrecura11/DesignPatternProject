package Client;

import Strategy.NoDiscount;

public class EskisehirTour extends TravelPlanner {

    String companyName = "Unknown Company";
    public EskisehirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.setDescription("Your travel plan has been created with a 0% discount.\n"+companyName + ": from Antalya to Eskisehir with");
        setDiscount(new NoDiscount());

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

