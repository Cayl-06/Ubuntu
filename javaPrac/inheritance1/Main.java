package inheritance1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.#");

    public static void main(String[] args){
        System.out.print("Enter account type: ");
        char type = sc.next().toUpperCase().charAt(0);
        
        int opCount = 1;
        if(type == 'D'){
            DebitAccount objDebit = new DebitAccount();
            
            while(true){
                System.out.print("Enter operation " + opCount + ": ");
                char symbol = sc.next().charAt(0);
                if(symbol == '0'){
                    System.out.println("Stopping...");
                    break;
                }
                double amount = sc.nextDouble();
                if(symbol == '+'){
                    objDebit.deposit(amount);
                    System.out.println();
                }
                else if(symbol == '-'){
                    objDebit.withdraw(amount);
                    System.out.println();
                }
                opCount++;
            }
        }
        else if(type == 'C'){
            CreditAccount objCredit = new CreditAccount();
            
            while(true){
                System.out.print("Enter operation " + opCount + ": ");
                char symbol = sc.next().charAt(0);
                if(symbol == '0' || symbol == 0){
                    System.out.println("Stopping...");
                    System.out.println();
                    break;
                }
                double amount = sc.nextDouble();
                if(symbol == '+'){
                    objCredit.charge(amount);
                    System.out.println();
                }
                else if(symbol == '-'){
                    objCredit.pay(amount);
                    System.out.println();
                }
                opCount++;
            }
        }
        sc.close();
    }
}