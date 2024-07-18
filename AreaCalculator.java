import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an option to calculate the area:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the side length of the square:");
                    double side = scanner.nextDouble();
                    System.out.println("Area of the square: " + calculateSquareArea(side));
                    break;
                case 2:
                    System.out.println("Enter the length of the rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the width of the rectangle:");
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + calculateRectangleArea(length, width));
                    break;
                case 3:
                    System.out.println("Enter the base of the triangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle:");
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle: " + calculateTriangleArea(base, height));
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
