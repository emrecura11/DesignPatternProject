import Client.TravelPlanner;
import Decorator.*;
import FactoryMethod.NoraCompany;
import FactoryMethod.TravelCompanyFactory;
import FactoryMethod.TurexCompany;
import Strategy.DiscountTypes;
import Strategy.FivePercentDiscount;
import Strategy.NoDiscount;
import Strategy.TenPercentDiscount;

import java.util.Scanner;

// Client code
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalActivity = 0;
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
        if (city == 1){
            while (true) {
                System.out.println("Would you like to join a Boat Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                       totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                }else{
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
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

                System.out.println("Would you like to join a Bicycle Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Hot Air Balloon Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
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

                System.out.println("Would you like to join a Bicycle Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
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
                System.out.println("Would you like to join a Bicycle Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
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
                System.out.println("Would you like to join a Boat Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = boatTourActivity(travelPlannerT, answer);
                    travelPlannerN = boatTourActivity(travelPlannerN, answer);
                    break;
                }
            }

            while (true) {

                System.out.println("Would you like to join a Museum Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = museumTourActivity(travelPlannerT, answer);
                    travelPlannerN = museumTourActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Party during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = partyNightActivity(travelPlannerT, answer);
                    travelPlannerN = partyNightActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Swimming Activity during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = swimmingActivity(travelPlannerT, answer);
                    travelPlannerN = swimmingActivity(travelPlannerN, answer);
                    break;
                }
            }
            while (true) {

                System.out.println("Would you like to join a Bicycle Tour during your trip? \n 1- Yes \n 0- No");
                int answer = scanner.nextInt();
                if (answer == 1){
                    totalActivity++;
                }
                if (answer != 1 && answer != 0) {
                    System.out.println("Please enter valid number!");

                } else {
                    travelPlannerT = bicycleTourActivity(travelPlannerT, answer);
                    travelPlannerN = bicycleTourActivity(travelPlannerN, answer);
                    break;
                }
            }

        }

        DiscountTypes discount;
        if (totalActivity == 0){
            discount = new NoDiscount();
            travelPlannerT.setDiscount(discount);
            travelPlannerT.applyDiscount(travelPlannerT.discount,travelPlannerT.price());
            travelPlannerN.setDiscount(discount);
            travelPlannerN.applyDiscount(travelPlannerN.discount, travelPlannerN.price());

        }else if (totalActivity ==1){
            discount = new NoDiscount();
            travelPlannerT.setDiscount(discount);
            travelPlannerT.applyDiscount(travelPlannerT.discount,travelPlannerT.price());
            discount = new FivePercentDiscount();
            travelPlannerN.setDiscount(discount);
            travelPlannerN.applyDiscount(travelPlannerN.discount, travelPlannerN.price());
        }else if (totalActivity == 2){
            discount = new FivePercentDiscount();
            travelPlannerT.setDiscount(discount);
            travelPlannerT.applyDiscount(travelPlannerT.discount,travelPlannerT.price());
            discount = new TenPercentDiscount();
            travelPlannerN.setDiscount(discount);
            travelPlannerN.applyDiscount(travelPlannerN.discount, travelPlannerN.price());
        }else{
            discount = new TenPercentDiscount();
            travelPlannerT.setDiscount(discount);
            travelPlannerT.applyDiscount(travelPlannerT.discount,travelPlannerT.price());
            travelPlannerN.setDiscount(discount);
            travelPlannerN.applyDiscount(travelPlannerN.discount, travelPlannerN.price());
        }

        System.out.println(travelPlannerT.getDescription());
        System.out.println("Turex price : " + travelPlannerT.price);
        System.out.println(travelPlannerN.getDescription());
        System.out.println("Nora price : " + travelPlannerN.price);


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



