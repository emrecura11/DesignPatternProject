package Client;

public class NevsehirTour extends TravelPlanner {


    String companyName = "Unknown Company";
    public NevsehirTour(String companyName, double companyPrice){
        this.price = companyPrice;
        this.getDescription(companyName + ": Antalya to Nevsehir with");
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