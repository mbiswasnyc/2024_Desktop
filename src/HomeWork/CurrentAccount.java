package HomeWork;

public class CurrentAccount extends Account {


    public CurrentAccount(int a) {
        super(a);
    }

    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount>0 && withdrawAmount<=700 && getBalance()-withdrawAmount>100)
            setBalance(getBalance()-withdrawAmount);
        else
            System.err.println("Withdraw amount exceed the limit... ");
    }
}
