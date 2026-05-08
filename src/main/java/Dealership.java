import java.util.ArrayList;

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
        for (Vehicle car : inventory) {
            if (car.getPrice() >= min && car.getPrice() <= max) {
                System.out.println(car);
            }
        }
    }

    public void getVehiclesByMakeModel(String make, String model) {
        for (Vehicle car : inventory) {
            if (car.getMake() == make && car.getModel() == model) {
                System.out.println(car);
            }
        }
    }

    public void getVehiclesByYear(int min, int max) {
        for (Vehicle car : inventory) {
            if (car.getYear() >= min && car.getPrice() <= max) {
                System.out.println(car);
            }
        }
    }

    public void getVehiclesByMiles(int min, int max) {
        for (Vehicle car : inventory) {
            if (car.getOdometer() >= min && car.getOdometer() <= max) {
                System.out.println(car);
            }
        }
    }

    public void getVehiclesByColor(String color) {
        for (Vehicle car : inventory) {
            if (car.getColor() == color) {
                System.out.println(car);
            }
        }
    }

    public void getAllVehicles() {
        for (Vehicle car : inventory) {
            System.out.println(car);
        }
    }
}
