public class Amount {
    private double amount;
    private String transactionType;

    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public double getAmount() { //used to retrieve the value of amount
        return amount;
    }

    public String getDescription() { //used to retrieve the value of transactionType
        return transactionType;
    }
}