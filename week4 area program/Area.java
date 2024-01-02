import java.util.Scanner;

abstract class Shape {
    protected int side1;
    protected int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = side1 * side2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    @Override
    public void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("Circle Area: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width for Rectangle:");
        int rectLength = scanner.nextInt();
        int rectWidth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);
        rectangle.printArea();

        System.out.println("Enter base and height for Triangle:");
        int triBase = scanner.nextInt();
        int triHeight = scanner.nextInt();
        Triangle triangle = new Triangle(triBase, triHeight);
        triangle.printArea();

        System.out.println("Enter radius for Circle:");
        int circleRadius = scanner.nextInt();
        Circle circle = new Circle(circleRadius);
        circle.printArea();

        scanner.close();
    }
}
