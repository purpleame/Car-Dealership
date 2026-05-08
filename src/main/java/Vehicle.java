

public class Vehicle {
    private int vin;
    private int year;
    private int odometer;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private double price;

    public Vehicle(int vin, int year, int odometer, String make,
                   String model, String vehicleType, String color, double price) {
        this.vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.price = price;
    }

    public int getVin() {return vin;}
    public int getYear() {return year;}
    public int getOdometer() {return odometer;}
    public String getMake() {return make;}
    public String getModel() {return model;}
    public String getVehicleType() {return vehicleType;}
    public String getColor() {return color;}
    public double getPrice() {return price;}

    public void setVin(int vin) {this.vin = vin;}
    public void setYear(int year) {this.year = year;}
    public void setOdometer(int odometer) {this.odometer = odometer;}
    public void setMake(String make) {this.make = make;}
    public void setModel(String model) {this.model = model;}
    public void setVehicleType(String vehicleType) {this.vehicleType = vehicleType;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(double price) {this.price = price;}

}
