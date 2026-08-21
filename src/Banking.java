public class Banking {
    private String accName;
    private String disposit;
    private String withdraw;


    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setDisposit(String disposit) {
        this.disposit = disposit;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }


    Banking(String accName, String disposit, String withdraw) {
        this.accName = accName;
        this.disposit = disposit;
        this.withdraw = withdraw;
    }


    static void main () {
        System.out.println("Welcome to the banking system");

        Banking banking = new Banking("Neymar", "Santander", "1000");

        double amount = 100;
        double balance = 1000;
        amount = amount - balance;
        banking.setWithdraw(String.valueOf(amount));
        System.out.println("Your new balance is: " + amount);


    }
}
