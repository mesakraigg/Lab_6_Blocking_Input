import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gallons = -1, mpg = -1, price = -1;
        String trash;

        do {
            System.out.print("Enter gallons in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
            }
            in.nextLine();
        } while (gallons <= 0);

        do {
            System.out.print("Enter fuel efficiency (MPG): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
            }
            in.nextLine();
        } while (mpg <= 0);
        
        do {
            System.out.print("Enter price per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
            }
            in.nextLine();
        } while (price <= 0);

        double cost100 = (100 / mpg) * price;
        double range = gallons * mpg;

        System.out.printf("Cost per 100 miles: $%.2f%n", cost100);
        System.out.printf("Total range: %.2f miles%n", range);
    }

}



