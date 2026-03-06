import java.util.Scanner;

        public class HighorLow {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int target = new java.util.Random().nextInt(10) + 1;
                int guess = 0;
                boolean valid = false;

                do {
                    System.out.print("Guess the number [1-10]: ");
                    if (in.hasNextInt()) {
                        guess = in.nextInt();
                        if (guess >= 1 && guess <= 10) valid = true;
                        else System.out.println("Out of range.");
                    } else {
                        System.out.println("Invalid input: " + in.next());
                    }
                } while (!valid);

                System.out.println("The random number was: " + target);
                if (guess == target) System.out.println("On the money!");
                else if (guess > target) System.out.println("High!");
                else System.out.println("Low!");
            }
        }
