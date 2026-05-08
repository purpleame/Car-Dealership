import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private static Scanner scanner = new Scanner(System.in);

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("--- " + dealership.getName() + " Menu ---");
            System.out.println("1) Search by Price");
            System.out.println("2) Search by Make/Model");
            System.out.println("3) Search by Year");
            System.out.println("4) Search by Color");
            System.out.println("5) Search by Mileage");
            System.out.println("6) List All Vehicles");
            System.out.println("7) Add Vehicle");
            System.out.println("8) Remove Vehicle");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetAllVehiclesRequest();
                case 7 -> processAddVehicleRequest();
                case 8 -> processRemoveVehicleRequest();
                case 0 -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
    }

    public void processGetByPriceRequest() {
        System.out.print("Enter min price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter max price: ");
        double max = scanner.nextDouble();
        dealership.getVehiclesByPrice(min, max);
    }

    public void processGetByMakeModelRequest() {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        dealership.getVehiclesByMakeModel(make, model);
    }

    public void processGetByYearRequest() {
        System.out.print("Enter min year: ");
        int min = scanner.nextInt();
        System.out.print("Enter max year: ");
        int max = scanner.nextInt();
        dealership.getVehiclesByYear(min, max);
    }

    public void processGetByColorRequest() {
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        dealership.getVehiclesByColor(color);
    }

    public void processGetByMileageRequest() {
        System.out.print("Enter min mileage: ");
        int min = scanner.nextInt();
        System.out.print("Enter max mileage: ");
        int max = scanner.nextInt();
         dealership.getVehiclesByMiles(min, max);
    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {
        System.out.println("Enter vehicle details (VIN, Year, Make, Model, Type, Color, Miles, Price):");
    }

    public void processRemoveVehicleRequest() {
        System.out.print("Enter VIN of vehicle to remove: ");
        String vin = scanner.nextLine();
    }
}
