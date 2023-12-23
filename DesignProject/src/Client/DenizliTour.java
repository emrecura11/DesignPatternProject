package Client;

public class DenizliTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public DenizliTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription(companyName + ": Antalya to Denizli with");
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