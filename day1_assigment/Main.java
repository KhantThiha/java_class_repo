package day1_assigment;

public class Main {
    public static void main(String[] args) {
        //ininitailize
        BankAccount Account1=new BankAccount(1000.00);
        //display
        System.out.println("opening balance: "+Account1.getBalance());
        //make deposit
        Account1.deposit(500.00);
        //display updated balance
        System.out.println("New balance: "+Account1.getBalance());
        //make withdrawal
        Account1.withdraw(200.00);
        //display updated balance
        System.out.println("New balance: "+Account1.getBalance());
    }
}
