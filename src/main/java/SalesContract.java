public class SalesContract extends Contract {
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;

    public SalesContract() {super();}

    public SalesContract(String date, String customerName, String customerEmail,
                         boolean carSold, double totalPrice, double monthlyPayment,
                         double salesTax, double recordingFee, double processingFee,
                         boolean isFinanced) {
        super(date, customerName, customerEmail, carSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
    }

    public double getSalesTax() {return salesTax;}
    public double getRecordingFee() {return recordingFee;}
    public double getProcessingFee() {return processingFee;}
    public boolean isFinanced() {return isFinanced;}

    public void setSalesTax(double salesTax) {this.salesTax = salesTax;}
    public void setRecordingFee(double recordingFee) {this.recordingFee = recordingFee;}
    public void setProcessingFee(double processingFee) {this.processingFee = processingFee;}
    public void setFinanced(boolean financed) {isFinanced = financed;}

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}