public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount () {
        this("unnamedaccount", 0);
        System.out.println("Created an unnamed accounts");
    }

    // ALT + INSERT To Generate Code

    public BankAccount (String customerName, double startingBalance) {
        this.customerName = customerName;
        this.balance = startingBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount){
        if(amount > 0){
            double previous = this.balance;
            this.balance += amount;
            receipt(previous, amount);
        } else {
            System.out.println("Error");
        }
    }

    public void withdraw(double amount){
        double previous = this.balance;
        if(previous - amount >= 0) {
            this.balance -= amount;
            receipt(previous, amount);
        } else {
            System.out.println("Error");
        }
    }

    private void receipt(double previous, double amount) {
        System.out.printf("Old Balance: $%.2f\nDeposit Amount: $%.2f\nNew Amount: $%.2f\n",
                previous, amount, this.balance);
    }

}
