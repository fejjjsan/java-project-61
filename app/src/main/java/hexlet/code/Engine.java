package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    public static final int MAX_RIGHT_ANSWERS = 3;

    public static void playGame(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        String task = game.getTask();
        System.out.println(task);

        int answersCount = 1;
        while (answersCount <= MAX_RIGHT_ANSWERS) {
            String[] data = game.getData();
            var question = data[0];
            var rightAnswer = data[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {
                if (answersCount == MAX_RIGHT_ANSWERS) {
                    System.out.println("Correct!");
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
                System.out.println("Correct!");
                answersCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
