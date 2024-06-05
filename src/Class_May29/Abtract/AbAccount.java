package Class_May29.Abtract;

public abstract class AbAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void depositMoney(double depositAmount);

    public abstract void withdrawMoney(double withdrawAmount);
}
