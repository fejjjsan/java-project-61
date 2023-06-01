package hexlet.code.games;

import java.util.Scanner;
import static hexlet.code.Engine.greeting;

public class Even {
    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }

    public static void playEvenGame() {
        String userName = greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answersCount = 1;

        while (answersCount <= 3) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * 10) + 1;
            String rightAnswer = isEven(randomNum);

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            // check for right answer
            if (userAnswer.equals(rightAnswer)) {
                if (answersCount < 3) {
                    System.out.println("Correct!");
                    answersCount++;
                } else {
                    System.out.println("Correct!");
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            }
            if (!userAnswer.equals(rightAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
