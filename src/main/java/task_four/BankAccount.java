package task_four;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount (String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    double getBalance(){
        return this.balance;
    }
    String getOwner(){
        return this.owner;
    }
    void setOwner(String newOwner){
        this.owner = newOwner;
    }
    void printBalance(){
        System.out.println("Balance: " + this.balance);
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
        balance -= amount;
        }
    }
}
