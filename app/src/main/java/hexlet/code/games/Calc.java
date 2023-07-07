package hexlet.code.games;

import static hexlet.code.Utils.rndNumGenerator;
import static hexlet.code.Utils.rndOperatorGenerator;

public final class Calc implements Game {
    private static final int MAX_RND_NUMBER = 10;
    private static final int LOW_RND_NUMBER = 1;
    private static final char[] MATH_SIGNS = {'-', '+', '*'};
    public String[] getData() {
        int num1 = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        int num2 = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        char operator = rndOperatorGenerator(MATH_SIGNS);
        String question = num1 + " " + operator + " " + num2;
        int rightAnswer = 0;
        String[] data = new String[2];

        switch (operator) {
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
                System.out.print("ERROR: missing operator");
                System.exit(1);
        }
        data[0] = question;
        data[1] = Integer.toString(rightAnswer);

        return data;
    }
    public String getTask() {
        return "What is the result of the expression?";
    }
}



