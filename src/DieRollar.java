import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling = true;

        while (continueRolling) {
            int throwCount = 0;
            int die1, die2, die3;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Throw#", "die1", "die2", "die3", "sum");

            do {
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                throwCount++;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", "throwCount", "die1", "die2", "die3", "sum");
            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple found! All dice show: " + die1);
            System.out.println("Do you want to roll again? (yes/no): ");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("yes")) {
                continueRolling = false;
            }
        }

        scanner.close();
    }
}


