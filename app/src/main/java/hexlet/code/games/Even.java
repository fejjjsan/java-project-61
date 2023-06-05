package hexlet.code.games;

import java.util.Scanner;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.strAnswerCheck;

public class Even {
    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }

    public static void playEven() {
        String userName = greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answersCount = 1;
        int maxRightAnswers = 3;
        int maxRandomNum = 10;

        while (answersCount <= maxRightAnswers) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * maxRandomNum) + 1;
            String rightAnswer = isEven(randomNum);

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
