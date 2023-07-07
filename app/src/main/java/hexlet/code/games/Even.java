package hexlet.code.games;

import static hexlet.code.Utils.rndNumGenerator;
public final class Even implements Game {
    private static final int MAX_RND_NUMBER = 10;
    private static final int LOW_RND_NUMBER = 1;
    public String[] getData() {
        int randomNum = rndNumGenerator(MAX_RND_NUMBER, LOW_RND_NUMBER);
        String rightAnswer = isEven(randomNum) ? "yes" : "no";
        String question = Integer.toString(randomNum);

        String[] data = new String[2];
        data[0] = question;
        data[1] = rightAnswer;

        return data;
    }
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}


