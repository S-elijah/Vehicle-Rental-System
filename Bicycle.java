public class Bicycle extends Vehicle {
    private double hourlyRate;
    private int hours;

    public Bicycle(String name, String id, double hourlyRate, int hours) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hourlyRate * hours;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bicycle | Rental Cost: $" + calculateRentalCost());
        System.out.println("Insurance: Not applicable");
    }
}
