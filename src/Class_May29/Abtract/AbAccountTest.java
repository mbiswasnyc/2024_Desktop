package Class_May29.Abtract;

public class AbAccountTest {
    public static void main(String[] args) {
        AbAccount sAccount = new AbSavingAccount();
        sAccount.depositMoney(500);

        sAccount.withdrawMoney( 401);
    }


}
