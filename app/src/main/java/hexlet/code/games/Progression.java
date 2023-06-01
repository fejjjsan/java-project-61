package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;

public class Progression {
    public static void playProgressionGame() {
        String userName = greeting();

        System.out.println("What number is missing in the progression?");

        int answersCount = 1;

        while (answersCount <= 3) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * 100) + 1; // 50
            int randomProgressionNum = (int) (Math.random() * 10) + 1; // 5
            var result = new StringBuilder();
            int rightAnswer = 0;
            int randomCounter = (int) (Math.random() * 10);

            for (int i = 0; i < 10; i++) {
                if (i == randomCounter) {
                    rightAnswer = randomNum;
                    result.append(" .. ");
                } else {
                    result.append(" " + randomNum + " ");
                }
                randomNum += randomProgressionNum;
            }

            System.out.println("Question: " + result);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

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
