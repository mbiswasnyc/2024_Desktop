package Class_May29;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    private String phoneNumber;
    private String email;

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0) {
            this.balance = balance;
        }else{
            System.out.println("please deposit positive amount");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositMoney(double depositAmount){
        if(depositAmount>=0) {
            balance = balance + depositAmount;
            //balance += depositAmount;
        }
        setBalance(balance);
    }

    public void withdrawMoney(double withdrawAmount){
        if(withdrawAmount<=balance){
            balance = balance - withdrawAmount;
            //balance -= withdrawAmount;
        }else{
            System.out.println("You can withdraw up to : "+balance);
        }
        setBalance(balance);
    }
}
