Vehicle Rental System

A Java demonstration of inheritance, abstraction, and polymorphism.  
Vehicles have a rental cost calculation, and some are insurable.

Features

- Abstract `Vehicle` class with concrete `displayDetails()` and abstract `calculateRentalCost()`.
- `Insurable` interface for vehicles that require insurance.
- Two implementations: `Car` (insurable, daily rate × days) and `Bicycle` (not insurable, hourly rate × hours).
- Polymorphic loop over a list of vehicles, with `instanceof` to safely call insurance methods.
