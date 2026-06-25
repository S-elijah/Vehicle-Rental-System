public class Car extends Vehicle implements Insurable {
    private double dailyRate;
    private int days;

    public Car(String name, String id, double dailyRate, int days) {
        super(name, id);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return dailyRate * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost() * 0.10;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car | Rental Cost: $" + calculateRentalCost());
        System.out.println("Insurance: $" + calculateInsurance());
    }
}
