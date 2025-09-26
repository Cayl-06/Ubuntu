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
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle Constructor");
    }

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

    public int area() {
        System.out.println("Rectangle Area");
        return length * width;
    }

    public int perimeter() {
        System.out.println("Rectangle Perimeter");
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
        System.out.println("Square Constructor");
    }

    @Override
    public int area() {
        System.out.println("Square Area");
        return getLength() * getLength();
    }

    @Override
    public int perimeter() {
        System.out.println("Square Perimeter");
        return 4 * getLength();
    }
}
