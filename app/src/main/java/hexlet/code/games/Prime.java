package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;

public class Prime {
    public static void playPrimeGame() {
        String userName = greeting();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int answersCount = 1;

        while (answersCount <= 3) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * 500) + 2;
            int divider = 2;
            int maxDivider = (int) Math.sqrt(randomNum);
            String rightAnswer;

            do {
                if (randomNum % divider != 0 || randomNum == 2) {
                    rightAnswer = "yes";
                } else {
                    rightAnswer = "no";
                    break;
                }
                divider++;
            } while (divider <= maxDivider);

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            // check for right answer
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                if (answersCount < 3) {
                    answersCount++;
                } else {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            }
            if (!userAnswer.equals(rightAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }
    }
}
