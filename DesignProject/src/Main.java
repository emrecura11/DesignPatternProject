import Client.TravelPlanner;
import Decorator.*;
import FactoryMethod.NoraCompany;
import FactoryMethod.TravelCompanyFactory;
import FactoryMethod.TurexCompany;

import java.util.Scanner;

// Client code
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int city = 0;

        TravelCompanyFactory turex = new TurexCompany();
        TravelCompanyFactory nora = new NoraCompany();
        TravelPlanner travelPlannerT;
        TravelPlanner travelPlannerN;
        System.out.println("Which cit do you want to travel?");
        System.out.println("1- Istanbul \n" +
                           "2- Nevsehir \n"+
                           "3- Eskisehir \n"+
                           "4- Denizli \n" +
                           "5- Izmir \n" );
        while (true){
            city = scanner.nextInt();
            if (city > 0 && city < 6) {
             travelPlannerT = turex.createCityTour(city);
             travelPlannerN = nora.createCityTour(city);
            break;
        } else {
            System.out.println("Please enter true city number!");
        }
    }
        double firstPriceTurex = travelPlannerT.price();
        double firstPriceNore = travelPlannerN.price();
        if (city == 1){
            while (true) {
                System.out.println("Would you like to join a Boat Tour during your trip with extra 180TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                }else{
                    travelPlannerT = boatTourActivity(travelPlannerT, answer);
                    travelPlannerN = boatTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip with extra 150TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip with extra 75TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }


        }else if (city == 2){

            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip with extra 75TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip with extra 150TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Hot Air Balloon Tour during your trip with extra 400TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = hotAirBalloonTourActivity(travelPlannerT, answer);
                    travelPlannerN = hotAirBalloonTourActivity(travelPlannerN, answer);
                    break;
                }
            }
        }else if (city == 3){

            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip with extra 75TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip with extra 150TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
        }else if (city==4){
            while (true) {
                System.out.println("Would you like to join a Bicycle Tour during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip with extra 150TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip with extra 75TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }

        }else if(city == 5){
            while (true) {
                System.out.println("Would you like to join a Boat Tour during your trip with extra 180TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = boatTourActivity(travelPlannerT, answer);
                    travelPlannerN = boatTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip with extra 150TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip with extra 75TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip with extra 100TL? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();

                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }

        }
        double a = travelPlannerT.price();

        double b= travelPlannerN.price();

        travelPlannerN.applyDiscount(travelPlannerN);
        travelPlannerT.applyDiscount(travelPlannerT);
        System.out.println(travelPlannerT.setDescription());
        System.out.println("Initial Turex Price : " + firstPriceTurex);
        System.out.println("Turex price with activity addition : "+a);
        System.out.println("Turex price after discount : " + travelPlannerT.price);
        System.out.println(travelPlannerN.setDescription());
        System.out.println("Initial Nora Price : " + firstPriceNore);

        System.out.println("Nora price with activity addition : "+b);
        System.out.println("Nora price after discount: " + travelPlannerN.price);


    }

    public static TravelPlanner bicycleTourActivity(TravelPlanner travelPlanner,int answer) {
        if (answer == 1) {
                travelPlanner = new BicycleTour(travelPlanner, 100);
            }
        return travelPlanner;
    }

    public static TravelPlanner museumTourActivity(TravelPlanner travelPlanner,int answer) {

        if (answer == 1) {
                travelPlanner = new MuseumTour(travelPlanner, 150);
            }
        return travelPlanner;
    }

    public static TravelPlanner boatTourActivity(TravelPlanner travelPlanner,int answer) {
        if (answer == 1) {
                travelPlanner = new BoatTour(travelPlanner, 180);
            }
        return travelPlanner;
    }

    public static TravelPlanner hotAirBalloonTourActivity(TravelPlanner travelPlanner,int answer) {
        if (answer == 1) {
                travelPlanner = new HotAirBalloon(travelPlanner, 400);


            }
        return travelPlanner;
    }

    public static TravelPlanner swimmingActivity(TravelPlanner travelPlanner,int answer) {
        if (answer == 1) {
                travelPlanner = new Swimming(travelPlanner, 75);

        }
        return travelPlanner;
    }
    public static TravelPlanner partyNightActivity(TravelPlanner travelPlanner,int answer) {
        if (answer == 1) {
                travelPlanner = new PartyNight(travelPlanner, 100);
            }
        return travelPlanner;
    }

}



