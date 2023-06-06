package hexlet.code;

import java.util.Scanner;
import static hexlet.code.games.Even.playEven;
import static hexlet.code.games.Calc.playCalc;
import static hexlet.code.games.Gcd.playGcd;
import static hexlet.code.games.Progression.playProgression;
import static hexlet.code.games.Prime.playPrime;

public class Engine {
    private static final int EXIT_OPTION = 0;
    private static final int GREET_OPTION = 1;
    private static final int EVEN_OPTION = 2;
    private static final int CALC_OPTION = 3;
    private static final int GCD_OPTION = 4;
    private static final int PROGRESSION_OPTION = 5;
    private static final int PRIME_OPTION = 6;
    public static final int MAX_RIGHT_ANSWERS = 3;
    public static void chooseTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.");
        System.out.print("\n1 - Greet \n2 - Even \n3 - Calc \n4 - GCD ");
        System.out.print("\n5 - Progression \n6 - Prime \n0 - Exit \nYour choice: ");


        int option = scanner.nextInt();

        switch (option) {
            case EXIT_OPTION -> System.out.print("See you soon!");
            case GREET_OPTION -> greeting();
            case EVEN_OPTION -> playEven();
            case CALC_OPTION -> playCalc();
            case GCD_OPTION -> playGcd();
            case PROGRESSION_OPTION -> playProgression();
            case PRIME_OPTION -> playPrime();
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
