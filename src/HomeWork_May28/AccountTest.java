package HomeWork_May28;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345);
        savingsAccount.deposit(500, 5);
        System.out.println(savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(13423);
        currentAccount.deposit(2500);
        currentAccount.withdraw(700);
        System.out.println(currentAccount.getBalance());

    }
}
