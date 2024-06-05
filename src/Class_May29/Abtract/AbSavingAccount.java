package Class_May29.Abtract;

public class AbSavingAccount extends AbAccount {
    @Override
    public void depositMoney(double depositAmount) {
        if(depositAmount>0){
            setBalance(getBalance()+depositAmount);
            System.out.println("The Balance of Saving Account is : "+getBalance());
        }
    }

    @Override
    public void withdrawMoney(double withdrawAmount) {
        if(getBalance()-withdrawAmount>=100){
            setBalance(getBalance()-withdrawAmount);
            System.out.println("Your current balance is : "+getBalance());
        }else{
            System.out.println("You cannot withdraw "+withdrawAmount+" at this moment");
        }
    }


}
