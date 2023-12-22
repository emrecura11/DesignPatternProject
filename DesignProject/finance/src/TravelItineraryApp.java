import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Factory Method Pattern
interface TravelPlan {
    Itinerary createItinerary();
}

class AdventureTravelPlan implements TravelPlan {
    @Override
    public Itinerary createItinerary() {
        return new AdventureItinerary();
    }
}

class CulturalTravelPlan implements TravelPlan {
    @Override
    public Itinerary createItinerary() {
        return new CulturalItinerary();
    }
}

// Decorator Pattern
interface Activity {
    void display();
    double calculatePrice();
}

class BaseActivity implements Activity {
    @Override
    public void display() {
        System.out.println("Basic Activity");
    }

    @Override
    public double calculatePrice() {
        return 50.0; // Default base price
    }
}

class SightseeingDecorator implements Activity {
    private final Activity decoratedActivity;

    public SightseeingDecorator(Activity decoratedActivity) {
        this.decoratedActivity = decoratedActivity;
    }

    @Override
    public void display() {
        decoratedActivity.display();
        System.out.println("Added Sightseeing");
    }

    @Override
    public double calculatePrice() {
        return decoratedActivity.calculatePrice() + 20.0; // Additional cost for sightseeing
    }
}

class AdventureActivityDecorator implements Activity {
    private final Activity decoratedActivity;

    public AdventureActivityDecorator(Activity decoratedActivity) {
        this.decoratedActivity = decoratedActivity;
    }

    @Override
    public void display() {
        decoratedActivity.display();
        System.out.println("Added Adventure Activity");
    }

    @Override
    public double calculatePrice() {
        return decoratedActivity.calculatePrice() + 30.0; // Additional cost for adventure activity
    }
}

// Composite Pattern
class CompositeActivity implements Activity {
    private List<Activity> activities = new ArrayList<Activity>();

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    @Override
    public void display() {
        for (Activity activity : activities) {
            activity.display();
        }
    }

    @Override
    public double calculatePrice() {
        double totalCost = 0.0;
        for (Activity activity : activities) {
            totalCost += activity.calculatePrice();
        }
        return totalCost;
    }
}

// Strategy Pattern
interface PaymentStrategy {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid with Credit Card. Amount: $" + amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid with PayPal. Amount: $" + amount);
    }
}

// Itinerary Pattern
interface Itinerary {
    void addActivity(Activity activity);
    void displayItinerary();
}

class AdventureItinerary implements Itinerary {
    private List<Activity> activities = new ArrayList<Activity>();

    @Override
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    @Override
    public void displayItinerary() {
        System.out.println("Adventure Itinerary:");
        for (Activity activity : activities) {
            activity.display();
        }
    }
}

class CulturalItinerary implements Itinerary {
    private List<Activity> activities = new ArrayList<Activity>();

    @Override
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    @Override
    public void displayItinerary() {
        System.out.println("Cultural Itinerary:");
        for (Activity activity : activities) {
            activity.display();
        }
    }
}

public class TravelItineraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factory Method: User selects the type of travel plan
        System.out.println("Select Travel Plan Type: 1 - Adventure, 2 - Cultural");
        int planType = getUserInput(scanner);

        TravelPlan travelPlan;
        if (planType == 1) {
            travelPlan = new AdventureTravelPlan();
        } else {
            travelPlan = new CulturalTravelPlan();
        }

        // Creating Itinerary using Factory Method
        Itinerary itinerary = travelPlan.createItinerary();

        // Composite Pattern: User customizes activities
        CompositeActivity compositeActivity = new CompositeActivity();

        while (true) {
            System.out.println("Select Activity Type: 1 - Sightseeing, 2 - Adventure, 3 - Done");
            int activityType = getUserInput(scanner);

            if (activityType == 3) {
                break;
            }

            Activity activity = createActivity(activityType);
            if (activity != null) {
                compositeActivity.addActivity(activity);
            }
        }

        itinerary.addActivity(compositeActivity);

        // Strategy Pattern: User selects payment method
        System.out.println("Select Payment Type: 1 - Credit Card, 2 - PayPal");
        int paymentType = getUserInput(scanner);

        PaymentStrategy paymentStrategy;
        if (paymentType == 1) {
            paymentStrategy = new CreditCardPayment();
        } else {
            paymentStrategy = new PayPalPayment();
        }

        // Processing payment
        double totalCost = compositeActivity.calculatePrice();
        paymentStrategy.processPayment(totalCost);

        // Displaying final itinerary
        System.out.println("\nFinal Itinerary:");
        itinerary.displayItinerary();
        System.out.println("Total Cost: $" + totalCost);
    }

    private static int getUserInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine(); // Consume the invalid input
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static Activity createActivity(int activityType) {
        switch (activityType) {
            case 1:
                return new SightseeingDecorator(new BaseActivity());
            case 2:
                return new AdventureActivityDecorator(new BaseActivity());
            default:
                System.out.println("Invalid activity type. Please try again.");
                return null;
        }
    }
}







