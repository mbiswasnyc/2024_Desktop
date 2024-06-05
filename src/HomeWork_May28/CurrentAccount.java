package HomeWork_May28;

public class CurrentAccount extends Account {


    public CurrentAccount(int a) {
        super(a);
    }

    public void withdraw(double sum)
    {
        if (sum>0 && sum<=700 && getBalance()-sum>100)
            setBalance(getBalance()-sum);
        else
            System.err.println("Withdraw amount exceeds the limit... ");
    }
}
