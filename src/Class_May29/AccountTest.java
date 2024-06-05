package Class_May29;

public class AccountTest {

    public static void main(String[] args) {
        SavingsAccount sAccount = new SavingsAccount(12345, "Joy");

        sAccount.depositMoney(500);
        System.out.println("Your Balance is : "+sAccount.getBalance());

        sAccount.withdrawMoney(150);
        System.out.println("Your Balance is : "+sAccount.getBalance());

        sAccount.interestAmount(50);
        System.out.println("with interestAmount, your balance is : "+sAccount.getBalance());

        sAccount.interestPercentage(5);
        System.out.println("with interestPercentage, your balance is : "+sAccount.getBalance());

        //Withdraw Limit
        sAccount.withdrawMoney(150);
        System.out.println("Your Balance is : "+sAccount.getBalance());
        sAccount.withdrawMoney(150);
        System.out.println("Your Balance is : "+sAccount.getBalance());
        sAccount.withdrawMoney(150);
        System.out.println("Your Balance is : "+sAccount.getBalance());



    }
}
