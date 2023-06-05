package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.numAnswerCheck;

public class Gcd {

    public static void playGcd() {
        String userName = greeting();

        System.out.println("Find the greatest common divisor of given numbers.");

        int answersCount = 1;
        int maxRightAnswers = 3;
        int maxRandomNum = 100;

        while (answersCount <= maxRightAnswers) {
            Scanner scanner = new Scanner(System.in);
            int num1 = (int) (Math.random() * maxRandomNum) + 1;
            int num2 = (int) (Math.random() * maxRandomNum) + 1;
            int biggerNum = Math.max(num1, num2);
            int lowerNum = Math.min(num1, num2);
            int rightAnswer = 0;
            int remainder = 0;

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            do {
                if (biggerNum % lowerNum == 0) {
                    rightAnswer = lowerNum;
                    break;
                }
                if (biggerNum % lowerNum != 0) {
                    remainder = biggerNum % lowerNum;
                    biggerNum = lowerNum;
                    lowerNum = remainder;
                }
            } while (remainder != 0);

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
