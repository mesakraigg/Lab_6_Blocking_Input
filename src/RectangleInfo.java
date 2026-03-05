import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done = false;

        do {
            System.out.print("Enter width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
                in.next();
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
                in.next();
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("Area: %.2f\nPerimeter: %.2f\nDiagonal: %.2f\n", area, perimeter, diagonal);
    }
}
