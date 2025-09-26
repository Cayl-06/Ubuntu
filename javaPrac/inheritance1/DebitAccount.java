package inheritance1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DebitAccount extends BankAccount{
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.#");
    private double balance;
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + df.format(balance));
    }
    
    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
        }
        System.out.println("Balance: " + df.format(balance));
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
}