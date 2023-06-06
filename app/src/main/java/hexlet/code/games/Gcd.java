package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.numAnswerCheck;
import static hexlet.code.Engine.MAX_RIGHT_ANSWERS;

public class Gcd {
    private static final int MAX_RND_NUMBER = 100;
    public static void playGcd() {
        String userName = greeting();

        System.out.println("Find the greatest common divisor of given numbers.");

        int answersCount = 1;

        while (answersCount <= MAX_RIGHT_ANSWERS) {
            Scanner scanner = new Scanner(System.in);
            int num1 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
            int num2 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
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
            correctAnswer = numAnswerCheck(userAnswer, rightAnswer, answersCount, MAX_RIGHT_ANSWERS, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }
}
