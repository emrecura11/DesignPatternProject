package FactoryMethod;

import Client.*;
import FactoryMethod.TravelPlannerFactory;

public class TurexPlanner extends TravelPlannerFactory {

    @Override
    public TravelPlanner createCityTour(int cityNumber) {
        switch (cityNumber) {
            case 1:
                return new IstanbulTour("Turex", 500);
            case 2:
                return new AnkaraTour("Turex",340);
            case 3:
                return new EskisehirTour("Turex", 220);
            case 4:
                return new DenizliTour("Turex", 200);
            case 5:
               return new IzmirTour("Turex", 280);
            default:
                return null;
        }
    }


}

