package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.strAnswerCheck;
import static hexlet.code.Engine.MAX_RIGHT_ANSWERS;

public class Prime {
    private static final int MAX_RND_NUMBER = 500;
    public static void playPrime() {
        String userName = greeting();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int answersCount = 1;

        while (answersCount <= MAX_RIGHT_ANSWERS) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * MAX_RND_NUMBER) + 2;
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
            correctAnswer = strAnswerCheck(userAnswer, rightAnswer, answersCount, MAX_RIGHT_ANSWERS, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }
}
