import java.util.*;

public class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String choice = "y";

        System.out.println("🎮 Even or Odd Guess Game");

        while (choice.equalsIgnoreCase("y")) {

            int number = rand.nextInt(100) + 1;
            System.out.print("Guess (even/odd): ");
            String guess = sc.next().toLowerCase();

            System.out.println("Number was: " + number);

            if ((number % 2 == 0 && guess.equals("even")) ||
                (number % 2 != 0 && guess.equals("odd"))) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }

            System.out.println("Score: " + score);

            System.out.print("Play again? (y/n): ");
            choice = sc.next();
        }

        System.out.println("Final Score: " + score);
    }
}
