package task_four;

public class Main {
    public static void main(String[] args) {
    BankAccount myAccount = new BankAccount("Daria", 5000);
    myAccount.printBalance();
    myAccount.deposit(1000);
    myAccount.printBalance();
    myAccount.withdraw(500);
    myAccount.printBalance();
    }
}
