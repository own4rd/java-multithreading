public class ATM {
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denoied");
        } else {
            account.debit(amount);
            System.out.println("$ " + amount + " successfully!");
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
