package Client;

import Strategy.FivePercentDiscount;
import Strategy.NoDiscount;
import Strategy.TenPercentDiscount;

public class IstanbulTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public IstanbulTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription("Your travel plan has been created with a 5% discount.\n"+companyName + ": from Antalya to Istanbul with");
        setDiscount(new FivePercentDiscount());

    }
    @Override
    public double price() {
        return this.price;
    }


    @Override
    public void getDescription(String description) {
        super.getDescription(description );
    }
}
