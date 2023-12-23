package Client;

public class IstanbulTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public IstanbulTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription(companyName + ": Antalya to Istanbul with");
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
