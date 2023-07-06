package hexlet.code.games;

public class Calc implements Game {
    private static final int MAX_RND_NUMBER = 10;
    private static final char[] MATH_SIGNS = {'-', '+', '*'};
    public String[] getData() {
        int num1 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        int num2 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        int rndOperator = (int) (Math.random() * MATH_SIGNS.length);
        String question = num1 + " " + MATH_SIGNS[rndOperator] + " " + num2;
        int rightAnswer = 0;
        String[] data = new String[2];

        switch (MATH_SIGNS[rndOperator]) {
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
                System.out.print("ERROR");
                System.exit(0);
        }
        data[0] = question;
        data[1] = Integer.toString(rightAnswer);

        return data;
    }
    public String getTask() {
        return "What is the result of the expression?";

    }
}



