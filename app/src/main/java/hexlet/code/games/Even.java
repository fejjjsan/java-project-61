package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.strAnswerCheck;
import static hexlet.code.Engine.MAX_RIGHT_ANSWERS;

public class Even {
    private static final int MAX_RND_NUMBER = 10;
    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }

    public static void playEven() {
        String userName = greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answersCount = 1;

        while (answersCount <= MAX_RIGHT_ANSWERS) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * MAX_RND_NUMBER) + 1;
            String rightAnswer = isEven(randomNum);

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
