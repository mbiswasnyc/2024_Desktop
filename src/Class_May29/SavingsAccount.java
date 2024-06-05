package Class_May29;

public class SavingsAccount extends Account{
    public SavingsAccount(int accountNumber, String accountName) {
        super(accountNumber, accountName);
    }
    int withdrawLimit = 3;
    int count = 0;

    public void interestAmount(int interestAmount){
        double balance2 = getBalance()+interestAmount;
        setBalance(balance2);
    }

    public void interestPercentage(int interestPercentage){
        double balance3 = getBalance()+(getBalance()*(interestPercentage /100.00));
        setBalance(balance3);
    }

    public void withdrawMoney(double withdrawAmount){
        if(getBalance()>withdrawAmount &&  count<withdrawLimit){
            setBalance(getBalance() - withdrawAmount);
            count++;
        }else{
            if(getBalance()<withdrawAmount){
                System.out.println("You can withdraw up to : "+getBalance());
            } else if (count==withdrawLimit) {
                System.out.println("You have reached your withdraw limit for the day.");
            }
        }
    }
}
