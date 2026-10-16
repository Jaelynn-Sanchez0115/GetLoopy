
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            int roll = 0;
            int die1, die2, die3;

            System.out.printf("%-6s %-6s %-6s %-6s %-6s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("------------------------------------------");

            do {
                roll++;

                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-6d %-6d %-6d %-6d%n",
                        roll, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple rolled!");

            System.out.print("Play again? (y/n): ");
            answer = input.next();

        } while (answer.equalsIgnoreCase("y"));

        input.close();
        System.out.println("Thanks for playing!");
    }
}

