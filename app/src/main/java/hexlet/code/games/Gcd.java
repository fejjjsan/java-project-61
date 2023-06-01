package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;

public class Gcd {
    public static void playGcdGame() {
        String userName = greeting();

        System.out.println("Find the greatest common divisor of given numbers.");

        int answersCount = 1;

        while (answersCount <= 3) {
            Scanner scanner = new Scanner(System.in);
            int num1 = (int) (Math.random() * 100) + 1;
            int num2 = (int) (Math.random() * 100) + 1;
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

            // check for right answer
            if (userAnswer == rightAnswer) {
                if (answersCount != 3) {
                    System.out.println("Correct!");
                    answersCount++;
                } else {
                    System.out.println("Correct!");
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            }
            if (userAnswer != rightAnswer) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
