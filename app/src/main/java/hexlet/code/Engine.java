package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    public static final int MAX_RIGHT_ANSWERS = 3;
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static void playGame(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = getUserName();
        System.out.println("Hello, " + userName + "!");

        String task = game.getTask();
        System.out.println(task);

        int answersCount = 1;
        while (answersCount <= MAX_RIGHT_ANSWERS) {
            String[] data = game.getData();
            var question = data[0];
            var rightAnswer = data[1];

            System.out.println(question);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            boolean correctAnswer;
            correctAnswer = answerCheck(userAnswer, rightAnswer, answersCount, MAX_RIGHT_ANSWERS, userName);

            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }
    }

    public static boolean answerCheck(String answer, String rightAnswer, int counter, int maxRightAns, String name) {
        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
            if (counter == maxRightAns) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        if (!answer.equals(rightAnswer)) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
            System.out.println("Let's try again, " + name + "!");
        }
        return answer.equals(rightAnswer);
    }
}
