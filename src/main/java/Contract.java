public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private boolean carSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract() {}

    public Contract(String date, String customerName, String customerEmail,
                    boolean carSold, double totalPrice, double monthlyPayment) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.carSold = carSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }


    public String getDate() {return date;}
    public String getCustomerName() {return customerName;}
    public String getCustomerEmail() {return customerEmail;}
    public boolean getCarSold() {return carSold;}
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();

    public void setDate(String date) {this.date = date;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public void setCustomerEmail(String customerEmail) {this.customerEmail = customerEmail;}
    public void setCarSold(boolean carSold) {this.carSold = carSold;}
    public void setTotalPrice(double totalPrice) {this.totalPrice = totalPrice;}
    public void setMonthlyPayment(double monthlyPayment) {this.monthlyPayment = monthlyPayment;}

}
