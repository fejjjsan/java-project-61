package hexlet.code;

import java.util.Scanner;

class Games {
    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }

    public static String greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
    public static void playEvenGame() {
        String name = greeting();
        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answersCount = 0;

        for (int counter = 0; counter < 3; counter++) {
            int randomNum = (int) (Math.random() * 10) + 1;
            Scanner scanner = new Scanner(System.in);
            String rightAnswer = isEven(randomNum);
            System.out.print("\nQuestion: " + randomNum);
            System.out.print("\nYour answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {
                if (answersCount < 3) {
                    System.out.print("Correct!");
                    answersCount++;
                }
                if (answersCount == 3) {
                    System.out.print("\nCongratulations, " + name + "!");
                }
            }
            if (!userAnswer.equals(rightAnswer)) {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.print("\nLet's try again, " + name);
                break;
            }
        }
    }
}
