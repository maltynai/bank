
public class Main {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(20150, "Kim ");
        String accountHolder = personalAccount.getAccountHolder();
        System.out.println(accountHolder);
        personalAccount.deposit(54520);
        try {
            personalAccount.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        personalAccount.printTransactionHistory();
    }
}