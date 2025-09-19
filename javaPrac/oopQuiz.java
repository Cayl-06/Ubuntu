
import java.util.Scanner;
import java.text.DecimalFormat;

public class oopQuiz{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    Triangle obj = new Triangle();
    
    System.out.print("Enter the base of the triangle:");
    float base = sc.nextFloat();
    obj.setBase(base);
    
    System.out.print("Enter the height of the triangle:");
    float height = sc.nextFloat();
    obj.setHeight(height);
    System.out.println();
    System.out.println("--- Triangle Properties ---");
    System.out.println("Base: " + df.format(obj.getBase()));
    System.out.println("Height: " + df.format(obj.getHeight()));
    System.out.println("Area: " + df.format(obj.getArea()));
    System.out.println("---------------------------");
    sc.close(); 
    }
    
}
