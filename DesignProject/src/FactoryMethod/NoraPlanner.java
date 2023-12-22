package FactoryMethod;


import Client.*;

// Concrete Creator for ETS
class NoraPlanner extends TravelPlannerFactory {
    @Override
    public TravelPlanner createCityTour(int cityNumber) {
        switch (cityNumber) {
            case 1:
                return new IstanbulTour("Nora", 640);
            case 2:
                return new AnkaraTour("Nora", 300);
            case 3:
                return new EskisehirTour("Nora", 250);
            case 4:
                return new DenizliTour("Nora", 180);
            case 5:
                return new IzmirTour("Nora",250);
            default:
                return null;
        }
    }

}