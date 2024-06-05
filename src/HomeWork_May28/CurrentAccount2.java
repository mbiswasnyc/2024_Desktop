package HomeWork_May28;

public class CurrentAccount2 extends Account {


    public CurrentAccount2(int a) {
        super(a);
    }

    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount>0 && withdrawAmount<=700 && getBalance()-withdrawAmount>100)
            setBalance(getBalance()-withdrawAmount);
        else
            System.err.println("Withdraw amount exceeds the limit... ");
    }
}