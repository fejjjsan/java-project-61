package hexlet.code.games;

public class Calc implements Game {
    private static final int MAX_RND_NUMBER = 10;
    public String[] getData() {
        int num1 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        int num2 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        char[] operators = {'-', '+', '*'};
        int rndOperator = (int) (Math.random() * operators.length);
        String question = "Question: " + num1 + " " + operators[rndOperator] + " " + num2;
        int rightAnswer = 0;
        String[] data = new String[2];

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
        data[0] = question;
        data[1] = Integer.toString(rightAnswer);

        return data;
    }
    public String getTask() {
        return "What is the result of the expression?";

    }
}



