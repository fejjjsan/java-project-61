package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Even.playEvenGame;
import static hexlet.code.games.Calc.playCalcGame;


class Engine {
    public static void chooseTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.");
        System.out.print("\n1 - Greet \n2 - Even \n3 - Calc \n0 - Exit\nYour choice: ");
        String userAnswer = scanner.next();

        switch (Integer.parseInt(userAnswer)) {
            case 0:
                System.out.print("See you soon!");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                playEvenGame();
                break;
            case 3:
                playCalcGame();
                break;
            default:
                break;
        }
    }
}
