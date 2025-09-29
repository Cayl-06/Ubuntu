package inheritance2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length: ");
        int side = sc.nextInt();

        Square sq = new Square(side);

        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());

        sc.close();
    }
}
class Rectangle {
    //1. super class rectangle which contains private variables
    private int length;
    private int width;

//1.1 constructor for superclass
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

//2. public setters and getters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    

//3. method that prints the name of the solution returns the area and perimeter formula of rectangle
    public void area() {
        System.out.println("Reectangle area: ");
        return length * width;
    }

    public void perimeter() {
        System.out.println("Rectangle perimeter: ");
        return 2 * (length + width);
    }


}

class Square extends Rectangle {
//constructor that uses the super class constructor and prints the new constructor shape name
    public Square(int side) {
        super(side, side);
        System.out.println("Square Constructor: ");
    }

//2 method that prints the new shape area (l x l) and perimeter (4 * L) and uses the public getter to get the private value from the superclass
   @Override
   public void area() {
        System.out.println("Square area: ");
        return getLength() * getLength();
   }

   @Override
   public void perimeter() {
    System.out.println("Square perimeter: ");
    return 4 * (getLength() + getWidth());
   }
}
