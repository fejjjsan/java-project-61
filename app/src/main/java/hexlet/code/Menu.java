package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Cli.greeting;

public class Menu {
    private static final int EXIT_OPTION = 0;
    private static final int GREET_OPTION = 1;
    private static final int EVEN_OPTION = 2;
    private static final int CALC_OPTION = 3;
    private static final int GCD_OPTION = 4;
    private static final int PROGRESSION_OPTION = 5;
    private static final int PRIME_OPTION = 6;
    public static void chooseTheGame() {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """;

        System.out.println("Please enter the game number and press Enter.");
        System.out.print(menu);
        System.out.print("Your choice: ");

        int option = scanner.nextInt();

        switch (option) {
            case EXIT_OPTION -> System.out.print("See you soon!");
            case GREET_OPTION -> greeting();
            case EVEN_OPTION -> playGame(new Even());
            case CALC_OPTION -> playGame(new Calc());
            case GCD_OPTION -> playGame(new Gcd());
            case PROGRESSION_OPTION -> playGame(new Progression());
            case PRIME_OPTION -> playGame(new Prime());
            default -> {
            }
        }
    }
}
