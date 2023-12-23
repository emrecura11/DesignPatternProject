package Client;

public class EskisehirTour extends TravelPlanner {

    String companyName = "Unknown Company";
    public EskisehirTour(String companyName, double companyPrice){
        this.price = companyPrice;

        this.getDescription(companyName + ": Antalya to Eskisehir with");
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

