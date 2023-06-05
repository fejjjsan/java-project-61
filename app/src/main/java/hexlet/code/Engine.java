package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Even.playEvenGame;
import static hexlet.code.games.Calc.playCalcGame;
import static hexlet.code.games.Gcd.playGcdGame;
import static hexlet.code.games.Progression.playProgressionGame;
import static hexlet.code.games.Prime.playPrimeGame;


public class Engine {
    public static void chooseTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.");
        System.out.print("\n1 - Greet \n2 - Even \n3 - Calc \n4 - GCD ");
        System.out.print("\n5 - Progression \n6 - Prime \n0 - Exit \nYour choice: ");

        int option = scanner.nextInt();

        switch (option) {
            case 0 -> System.out.print("See you soon!");
            case 1 -> greeting();
            case 2 -> playEvenGame();
            case 3 -> playCalcGame();
            case 4 -> playGcdGame();
            case 5 -> playProgressionGame();
            case 6 -> playPrimeGame();
            default -> {
            }
        }
    }

    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public static boolean numAnswerCheck(int answer, int rightAnswer, int counter, int maxRightAns, String name) {
        if (answer == rightAnswer) {
            System.out.println("Correct!");
            if (counter == maxRightAns) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        if (answer != rightAnswer) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
            System.out.println("Let's try again, " + name + "!");
        }
        return answer == rightAnswer;
    }

    public static boolean strAnswerCheck(String answer, String rightAnswer, int counter, int maxRightAns, String name) {
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
