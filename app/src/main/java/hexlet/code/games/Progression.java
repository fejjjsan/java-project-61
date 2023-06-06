package hexlet.code.games;

import java.util.Scanner;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.numAnswerCheck;
import static hexlet.code.Engine.MAX_RIGHT_ANSWERS;

public class Progression {
    private static final int MAX_RANDOM_NUM = 100;
    private static final int MAX_PROGRESSION = 10;
    private static final int MAX_RND_COUNTER = 10;
    public static void playProgression() {
        String userName = greeting();

        System.out.println("What number is missing in the progression?");

        int answersCount = 1;

        while (answersCount <= MAX_RIGHT_ANSWERS) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * MAX_RANDOM_NUM) + 1;
            int randomProgressionNum = (int) (Math.random() * MAX_PROGRESSION) + 1;
            var result = new StringBuilder();
            int rightAnswer = 0;
            int randomCounter = (int) (Math.random() * MAX_RND_COUNTER);

            for (int i = 0; i < 10; i++) {
                if (i == randomCounter) {
                    rightAnswer = randomNum;
                    result.append(".. ");
                } else {
                    result.append(randomNum);
                    result.append(" ");
                }
                randomNum += randomProgressionNum;
            }

            System.out.println("Question: " + result);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            boolean correctAnswer;
            correctAnswer = numAnswerCheck(userAnswer, rightAnswer, answersCount, MAX_RIGHT_ANSWERS, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }
}
