package Client;

import Strategy.FivePercentDiscount;
import Strategy.NoDiscount;
import Strategy.TenPercentDiscount;

public class EskisehirTour extends TravelPlanner {

    String companyName = "Unknown Company";
    public EskisehirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription("Your travel plan has been created with a 0% discount.\n"+companyName + ": Antalya to Eskisehir with");
        setDiscount(new NoDiscount());

    }
    @Override
    public double price() {
        return 180.0;
    }


    @Override
    public void getDescription(String description) {
        super.getDescription(description);
    }
}

