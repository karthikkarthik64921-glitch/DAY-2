import java.util.Scanner ;
class BankAccount{
    private double balance;
    
    public BankAccount(double ini) {
        this . balance = 0.0;
    }

    public void deposit(int amount) {
        this . balance += amount;
        System.out.println("Successfully deposited(Integer): $" + amount);
        displayBalance();
    }

    public void deposit(int amount , String description) {
        this . balance += amount;
        System.out.println("Successfully deposited: $" + amount + "| Description: " + description);
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Updated Account Balance: $" + this . balance + "\n");
    }
}
