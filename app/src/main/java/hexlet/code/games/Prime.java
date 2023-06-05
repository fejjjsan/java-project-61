package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.strAnswerCheck;

public class Prime {
    public static void playPrimeGame() {
        String userName = greeting();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int answersCount = 1;
        int maxRightAnswers = 3;
        int maxRandomNum = 500;

        while (answersCount <= maxRightAnswers) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * maxRandomNum) + 2;
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

            boolean correctAnswer;
            correctAnswer = strAnswerCheck(userAnswer, rightAnswer, answersCount, maxRightAnswers, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }
}
