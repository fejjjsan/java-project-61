package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.numAnswerCheck;

public class Progression {
    public static void playProgression() {
        String userName = greeting();

        System.out.println("What number is missing in the progression?");

        int answersCount = 1;
        int maxRightAnswers = 3;
        int maxRandomNum = 100;
        int maxProgression = 10;
        int maxRandomCounter = 10;

        while (answersCount <= maxRightAnswers) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * maxRandomNum) + 1; // 50
            int randomProgressionNum = (int) (Math.random() * maxProgression) + 1; // 5
            var result = new StringBuilder();
            int rightAnswer = 0;
            int randomCounter = (int) (Math.random() * maxRandomCounter);


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
            correctAnswer = numAnswerCheck(userAnswer, rightAnswer, answersCount, maxRightAnswers, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }
}
