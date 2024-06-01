package HomeWork;

public class SavingsAccount extends Account{

    public SavingsAccount(int a) {
        super(a);
    }

    public void deposit(double depositAmount, double interestPercentage)
    {
        if (depositAmount>0)
            setBalance(getBalance()+depositAmount+(depositAmount*(interestPercentage/100)));
        else
            System.out.println("Account.deposit( "+depositAmount+" ): "
                    +"cannot deposit negative amount.");
    }
}
