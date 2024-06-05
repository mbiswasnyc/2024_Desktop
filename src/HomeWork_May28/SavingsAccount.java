package HomeWork_May28;

public class SavingsAccount extends Account{

    public SavingsAccount(int a) {
        super(a);
    }

    public void deposit(double sum, double interestPercentage)
    {
        if (sum>0)
            setBalance(getBalance()+sum+(sum*(interestPercentage/100)));
        else
            System.out.println("Account.deposit( "+sum+" ): "
                    +"cannot deposit negative amount.");
    }
}
