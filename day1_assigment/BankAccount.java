package day1_assigment;

public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Depositing: "+amount);
    }
    public void withdraw(double amount){
        if(this.balance<amount){
            System.err.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawing: "+amount);
    }
}