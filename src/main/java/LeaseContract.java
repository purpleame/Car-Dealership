public class LeaseContract extends Contract {
    private double leaseFee;
    private double endingValue;

    public LeaseContract() {super();}

    public LeaseContract(String date, String customerName, String customerEmail,
                         boolean carSold, double totalPrice, double monthlyPayment,
                         double leaseFee, double endingValue) {
        super(date, customerName, customerEmail, carSold, totalPrice, monthlyPayment);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
    }

    public double getLeaseFee() {return leaseFee;}
    public double getEndingValue() {return endingValue;}

    public void setLeaseFee(double leaseFee) {this.leaseFee = leaseFee;}
    public void setEndingValue(double endingValue) {this.endingValue = endingValue;}

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}