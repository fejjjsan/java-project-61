package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;


public class Calc {
    public static void playCalcGame() {
        String userName = greeting();

        System.out.println("What is the result of the expression?");

        int answersCount = 1;

        char[] operators = {'-', '+', '*'};

        while (answersCount <= 3) {
            Scanner scanner = new Scanner(System.in);
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;
            int rndOperator = (int) (Math.random() * 3);
            int rightAnswer = 0;

            System.out.println("Question: " + num1 + " " + operators[rndOperator] + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            switch (operators[rndOperator]) {
                case '-':
                    rightAnswer = num1 - num2;
                    break;
                case '+':
                    rightAnswer = num1 + num2;
                    break;
                case '*':
                    rightAnswer = num1 * num2;
                    break;
                default: System.out.print("no operator");
            }

            // check for right answer
            if (userAnswer == rightAnswer) {
                System.out.println("Correct!");
                if (answersCount != 3) {
                    answersCount++;
                } else {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            }
            if (userAnswer != rightAnswer) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
