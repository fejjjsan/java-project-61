package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static void playCalcGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

        int answersCount = 1;


        for (int i = 0; i < 3; i++) {
            int num1 = (int) (Math.random() * 100) + 1;
            int num2 = (int) (Math.random() * 100) + 1;
            int rndOperator = (int) (Math.random() * 3) + 1;
            char operator;
            int rightAnswer = 0;
            int userAnswer = 0;


            switch (rndOperator) {
                case 1: operator = '-';
                    System.out.println("Question: " + num1 + operator + num2);
                    System.out.print("Your answer: ");
                    userAnswer = scanner.nextInt();
                    rightAnswer = num1 - num2;
                    break;
                case 2: operator = '+';
                    System.out.println("Question: " + num1 + operator + num2);
                    System.out.print("Your answer: ");
                    userAnswer = scanner.nextInt();
                    rightAnswer = num1 + num2;
                    break;
                case 3: operator = '*';
                     System.out.println("Question: " + num1 + operator + num2);
                    System.out.print("Your answer: ");
                    userAnswer = scanner.nextInt();
                    rightAnswer = num1 * num2;
                    break;
                default: System.out.print("no operator");
            }

            if (userAnswer == rightAnswer) {
                if (answersCount != 3) {
                    System.out.println("Correct!");
                    answersCount++;
                } else {
                    System.out.print("\nCongratulations, " + userName + "!\n");
                    break;
                }
            }
            if (userAnswer != rightAnswer) {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.print("\nLet's try again, " + userName + "\n");
                break;
            }

        }
    }
}
