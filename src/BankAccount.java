public class BankAccount {
    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    void topUp(int amount) {
        balance += amount;
    }

    void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getOverdraft() {
        return overdraft;
    }
}
