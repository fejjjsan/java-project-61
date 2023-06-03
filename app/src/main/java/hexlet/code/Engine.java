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


        String gameNum = scanner.next();


        switch (Integer.parseInt(gameNum)) {
            case 0:
                System.out.print("See you soon!");
                break;
            case 1:
                greeting();
                break;
            case 2:
                playEvenGame();
                break;
            case 3:
                playCalcGame();
                break;
            case 4:
                playGcdGame();
                break;
            case 5:
                playProgressionGame();
                break;
            case 6:
                playPrimeGame();
                break;
            default:
                break;
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

    public static String provideUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
