package Client;

public class IzmirTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public IzmirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription(companyName + ": Antalya to Izmir with");
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
