import java.util.Scanner;

public class MultiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Calculate Simple Interest");
            System.out.println("3. Calculate Area of Field in Acres");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    convertTemperature(scanner);
                    break;
                case 2:
                    calculateSimpleInterest(scanner);
                    break;
                case 3:
                    calculateFieldArea(scanner);
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

    private static void convertTemperature(Scanner scanner) {
        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    private static void calculateSimpleInterest(Scanner scanner) {
        System.out.println("Enter the principal amount (P):");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest (R):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period in years (T):");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    private static void calculateFieldArea(Scanner scanner) {
        System.out.println("Enter the length of the field in feet:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the field in feet:");
        double width = scanner.nextDouble();

        double areaInSquareFeet = length * width;
        double areaInAcres = areaInSquareFeet / 43560;

        System.out.println("Area of the field in acres: " + areaInAcres);
    }
}
