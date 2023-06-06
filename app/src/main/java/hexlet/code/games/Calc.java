package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.numAnswerCheck;
import static hexlet.code.Engine.MAX_RIGHT_ANSWERS;


public class Calc {
    private static final int MAX_RND_NUMBER = 10;
    public static void playCalc() {
        String userName = greeting();

        System.out.println("What is the result of the expression?");

        int answersCount = 1;

        char[] operators = {'-', '+', '*'};

        while (answersCount <= MAX_RIGHT_ANSWERS) {
            Scanner scanner = new Scanner(System.in);
            int num1 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
            int num2 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
            int rndOperator = (int) (Math.random() * operators.length);
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
                default:
                    System.out.print("no operator");
                    break;
            }

            boolean correctAnswer;
            correctAnswer = numAnswerCheck(userAnswer, rightAnswer, answersCount, MAX_RIGHT_ANSWERS, userName);
            if (correctAnswer) {
                answersCount++;
            } else {
                break;
            }
        }

    }
}
