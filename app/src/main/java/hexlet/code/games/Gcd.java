package hexlet.code.games;

import static hexlet.code.Utils.rndNumGenerator;

public final class Gcd implements Game {
    private static final int MAX_RND_NUMBER = 100;
    private static final int LOW_RND_NUMBER = 1;

    public String[] getData() {
        int num1 = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        int num2 = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        int biggerNum = Math.max(num1, num2);
        int lowerNum = Math.min(num1, num2);

        String[] data = new String[2];
        String question = num1 + " " + num2;

        int gcd = getGcd(biggerNum, lowerNum);

        data[0] = question;
        data[1] = Integer.toString(gcd);

        return data;
    }

    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static int getGcd(int biggerNum, int lowerNum) {
        int remainder;
        int rightAnswer = 0;
        do {
            if (biggerNum % lowerNum == 0) {
                rightAnswer = lowerNum;
                break;
            } else {
                remainder = biggerNum % lowerNum;
                biggerNum = lowerNum;
                lowerNum = remainder;
            }
        } while (remainder != 0);
        return rightAnswer;
    }
}

