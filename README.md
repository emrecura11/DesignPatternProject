# THE DESIGN PATTERNS THAT WE USED 

We used three design patterns in our project. They are:

■ Factory Method Pattern

■ Decorator Pattern

■ Strategy Pattern

## Factory Method Pattern

■ The reason we use the Factory Method Pattern is to let different
companies to decide the basic pricings of the city tours during their
creation. 

■ Discrete companies extend a common abstract class and override
createCityTour method. In this method they decide the basic prices
of the travel plans for each city.

## Decorator Pattern

■ We used Decorator Pattern to attach additional activities to travel
plans dynamically. This way, the users will be able to add the
activities they want in runtime. In other words, the travel plan will
be wrapped with zero or more activities based on the user’s choice.

■ Each activity adds its additional price to the basic price.

■ Both discrete activity classes(decorators) and discrete city tour
classes(objects) extend the same abstract class.

## Strategy Pattern

■ We used Strategy Pattern to encapsulate the discount types that vary
across the city tours.

■ Our system applies the discounts for each city tour and the discount
amount changes from city to city. 

■ Discounts are applied after the city tour and the activities are
selected, on the total cost.
