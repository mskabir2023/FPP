package Assignment3.Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter 1 for Circle");
            System.out.println("Enter 2 for Rectangle");
            System.out.println("Enter 3 for Triangle");

            String shapeType = sc.nextLine().toUpperCase();

            switch (shapeType) {
                case "1":
                    System.out.println("radius of the Circle: ");
                    double radius = Double.parseDouble(sc.nextLine());
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle : " + circle.computeArea());
                    break;
                case "2":
                    System.out.println("width of Rectangle: ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.println("length of Rectangle: ");
                    double length = Double.parseDouble(sc.nextLine());
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("area of Rectangle is: " + rectangle.computeArea());
                    break;
                case "3":
                    System.out.println("base of Triangle: ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.println("height of the Triangle: ");
                    double height = Double.parseDouble(sc.nextLine());
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("area of radius is: " + triangle.computeArea());
                    break;
            }

            System.out.println("Enter Yes for yes or No for no: ");
            choice = sc.nextLine();
        } while ((choice.startsWith("Yes") || choice.startsWith("y")));

        sc.close();
    }
}
