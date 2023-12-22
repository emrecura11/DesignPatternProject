import Client.TravelPlanner;
import Decorator.MuseumTour;
import FactoryMethod.TravelPlannerFactory;
import FactoryMethod.TurexPlanner;
import Strategy.DiscountTypes;
import Strategy.FivePercentDiscount;

import java.util.Scanner;

// Client code
    public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int totalActivity = 0;
                System.out.println("city?");
                int city = scanner.nextInt();
                System.out.println("müze?");
                int a = scanner.nextInt();
                if (a == 1) {
                    totalActivity++;
                }
                System.out.println("yüzme?");
                int b = scanner.nextInt();
                if (b == 1) {
                    totalActivity++;
                }


                TravelPlannerFactory turex = new TurexPlanner();
                TravelPlanner tPlanner = ((TurexPlanner) turex).createCityTour(city);

                // Add activities
                if (a == 1) {
                    tPlanner = new MuseumTour(tPlanner, 120);
                }
                if (b == 1) {
                    tPlanner = new MuseumTour(tPlanner, 100);
                }

            DiscountTypes discountTypes = new FivePercentDiscount();

            tPlanner.setDiscount(discountTypes);
            tPlanner.applyDiscount(tPlanner.discount, tPlanner.price());

            System.out.println("Final Price after Discount: " + tPlanner.price);
            System.out.println("Description: " + tPlanner.getDescription());

            }
    }


