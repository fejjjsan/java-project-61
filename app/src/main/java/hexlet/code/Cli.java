package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Games.playEvenGame;

class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void chooseTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.");
        System.out.print("\n1 - Greet \n2 - Even \n0 - Exit\nYour choice: ");
        String userAnswer = scanner.next();

        switch (Integer.parseInt(userAnswer)) {
            case 0:
                System.out.print("See you soon!");
                break;
            case 1:
                greeting();
                break;
            case 2:
                playEvenGame();
            default:
                break;

        }
    }
}
