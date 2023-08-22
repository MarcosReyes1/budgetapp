public class Account {
    private int balance = 0;
    private int paycheck = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int newPaycheck) {
        this.paycheck = newPaycheck;
    }
    public void displayBalance() {
        System.out.println("You're current balance is: " + balance);
    }
}
