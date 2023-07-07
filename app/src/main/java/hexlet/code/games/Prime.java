package hexlet.code.games;

import static hexlet.code.Utils.rndNumGenerator;

public final class Prime implements Game {
    private static final int MAX_RND_NUMBER = 500;

    private static final int LOW_RND_NUMBER = 0;

    public String[] getData() {
        int randomNum = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        String question = Integer.toString(randomNum);
        String rightAnswer = isPrime(randomNum) ? "yes" : "no";

        String[] data = new String[2];
        data[0] = question;
        data[1] = rightAnswer;

        return data;
    }

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static boolean isPrime(int randomNum) {
        if (randomNum == 0 || randomNum == 1) {
            return false;
        }

        int divider = 2;
        boolean result;
        int maxDivider = (int) Math.sqrt(randomNum);
        do {
            if (randomNum % divider != 0 || randomNum == 2) {
                result = true;
            } else {
                result = false;
                break;
            }
            divider++;
        } while (divider <= maxDivider);
        return result;
    }

}

