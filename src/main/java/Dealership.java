import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhone() {return phone;}
    public ArrayList<Vehicle> getInventory() {return inventory;}

    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone) {this.phone = phone;}

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    public void getVehiclesByPrice(double min, double max) {
        List<Vehicle> all = filterVehicles(car -> car.getPrice()
                >= min && car.getPrice() <= max);
        vehiclePrinter(all);
    }

    public void getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> all = filterVehicles(car -> car.getMake().equalsIgnoreCase(make)
                && car.getModel().equalsIgnoreCase(model));
        vehiclePrinter(all);
    }

    public void getVehiclesByYear(int min, int max) {
        List<Vehicle> all = filterVehicles(car -> car.getYear()
                >= min && car.getYear() <= max);
        vehiclePrinter(all);
    }

    public void getVehiclesByMiles(int min, int max) {
        List<Vehicle> all = filterVehicles(car -> car.getOdometer()
                >= min && car.getOdometer() <= max);
        vehiclePrinter(all);
    }

    public void getVehiclesByColor(String color) {
        List<Vehicle> all = filterVehicles(car -> car.getColor().equalsIgnoreCase(color));
        vehiclePrinter(all);
    }

    public void getAllVehicles() {
        List<Vehicle> all = filterVehicles(car -> true);
        vehiclePrinter(all);
    }

    public List<Vehicle> filterVehicles(Predicate<Vehicle> condition) {
        List<Vehicle> results = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (condition.test(vehicle)) {
                results.add(vehicle);
            }
        }

        return results;
    }

    public void vehiclePrinter(List<Vehicle> all) {
        for (Vehicle vehicle : all) {
            System.out.println(vehicle);
        }
    }
}
