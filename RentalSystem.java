import java.util.ArrayList;

public class RentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Sedan", "C001", 50.0, 3));
        vehicles.add(new Bicycle("Mountain Bike", "B001", 10.0, 5));
        vehicles.add(new Car("SUV", "C002", 75.0, 2));

        System.out.println("=== Vehicle Rental System ===\n");

        for (Vehicle v : vehicles) {
            v.displayDetails();

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                System.out.println("Insurance Applied: $" + insurable.calculateInsurance());
            }
            System.out.println();
        }
    }
}
