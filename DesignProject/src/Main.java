import Client.TravelPlanner;
import Decorator.*;
import FactoryMethod.NoraCompany;
import FactoryMethod.TravelCompanyFactory;
import FactoryMethod.TurexCompany;
import Strategy.DiscountTypes;
import Strategy.FivePercentDiscount;

import java.util.Scanner;

// Client code
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalActivity = 0;

        TravelCompanyFactory turex = new TurexCompany();
        TravelCompanyFactory nora = new NoraCompany();





    }

    public void bicycleTourActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Cycling Tour during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new BicycleTour(travelPlanner, 100);
                situation = false;

            } else {
                situation = false;
            }
        }
    }

    public void museumTourActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new MuseumTour(travelPlanner, 150);
                situation = false;

            } else {
                situation = false;

            }
        }
    }

    public void boatTourActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Boat Tour during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new BoatTour(travelPlanner, 180);
                situation = false;

            } else {
                situation = false;

            }
        }
    }

    public void hotAirBalloonTourActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Hot Air Balloon Tour during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new HotAirBalloon(travelPlanner, 400);
                situation = false;

            } else {
                situation = false;

            }
        }
    }

    public void swimmingActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new Swimming(travelPlanner, 75);
                situation = false;

            } else {
                situation = false;

            }
        }
    }
    public void partyNightActivity(TravelPlanner travelPlanner) {
        Scanner sc = new Scanner(System.in);
        boolean situation = true;
        while (situation) {
            System.out.println("Would you like to join a Party Night activity during your trip? \n 1- Yes \n 0- No");
            int answer = sc.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Please enter your answer correctly");
            } else if (answer == 1) {
                travelPlanner = new PartyNight(travelPlanner, 100);
                situation = false;

            } else {
                situation = false;

            }
        }
    }
}



