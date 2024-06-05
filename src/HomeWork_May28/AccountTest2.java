package HomeWork_May28;

public class AccountTest2 {
    public static void main(String[] args) {
        SavingsAccount2 savingsAccount2 = new SavingsAccount2(12345);
        savingsAccount2.deposit(500, 5);
        System.out.println(savingsAccount2.getBalance());

        CurrentAccount2 currentAccount2 = new CurrentAccount2(13423);
        currentAccount2.deposit(2500);
        currentAccount2.withdraw(700);
        System.out.println(currentAccount2.getBalance());

    }
}