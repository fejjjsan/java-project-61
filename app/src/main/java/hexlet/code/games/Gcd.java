package hexlet.code.games;

public class Gcd implements Game {
    private static final int MAX_RND_NUMBER = 100;

    public String[] getData() {
        int num1 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        int num2 = (int) (Math.random() * MAX_RND_NUMBER) + 1;
        int biggerNum = Math.max(num1, num2);
        int lowerNum = Math.min(num1, num2);
        int rightAnswer = 0;
        int remainder = 0;
        String[] data = new String[2];

        String question = "Question: " + num1 + " " + num2;

        do {
            if (biggerNum % lowerNum == 0) {
                rightAnswer = lowerNum;
                break;
            }
            if (biggerNum % lowerNum != 0) {
                remainder = biggerNum % lowerNum;
                biggerNum = lowerNum;
                lowerNum = remainder;
            }
        } while (remainder != 0);

        data[0] = question;
        data[1] = Integer.toString(rightAnswer);

        return data;
    }

    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }
}

