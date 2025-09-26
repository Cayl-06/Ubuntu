package inheritance1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class  CreditAccount extends BankAccount{
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.#");
    private double creditBalance;
    
    public void charge(double amount){
        creditBalance += amount;
        System.out.println("Credit Balance: " + df.format(creditBalance));
    }
    
    public void pay(double amount){
        creditBalance -= amount;
        System.out.println("Credit Balance: " + df.format(creditBalance));
    }
    
    public void setCreditBalance(double creditBalance){
        this.creditBalance = creditBalance;
    }
    
    public double getCreditBalance(){
        return creditBalance;
    }
}