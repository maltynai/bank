
import java.util.ArrayList;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public ArrayList<Amount> transactions = new ArrayList<>();
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        Amount a = new Amount(amount, "deposit");
        balance += amount;
        transactions.add(a);
        System.out.println("The deposit: "+ amount);
        System.out.println("You have now " + getBalance());
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        Amount a = new Amount(amount, "withdraw");

        if (balance >= amount) {
            balance -= amount;
            transactions.add(a);
            System.out.println("The amount: " + amount);
            System.out.println("You have now " + getBalance());
        } else {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
    }


    public void printTransactionHistory() {
        System.out.println("Transaction " + getAccountHolder() + getAccountNumber());
        for (Amount transaction : transactions) {
            System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
}