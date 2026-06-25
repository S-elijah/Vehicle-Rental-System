public abstract class Vehicle {
    protected String name;
    protected String id;

    public Vehicle(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Vehicle: " + name + " | ID: " + id);
    }

    public abstract double calculateRentalCost();
}
