package hexlet.code.games;

import static hexlet.code.Utils.rndNumGenerator;

public final class Progression implements Game {
    private static final int MAX_RND_NUM = 100;
    private static final int LOW_RND_NUMBER = 1;
    private static final int MAX_PROGRESSION = 10;
    private static final int MAX_RND_COUNTER = 10;


    public String[] getData() {
        int randomNum = rndNumGenerator(MAX_RND_NUM, LOW_RND_NUMBER);
        int randomProgressionNum = rndNumGenerator(MAX_PROGRESSION, LOW_RND_NUMBER);
        var result = new StringBuilder();
        int rightAnswer = 0;
        int randomCounter = rndNumGenerator(MAX_RND_COUNTER, LOW_RND_NUMBER);
        String question;

        for (int i = 1; i <= MAX_RND_COUNTER; i++) {
            if (i == randomCounter) {
                rightAnswer = randomNum;
                result.append(".. ");
            } else {
                result.append(randomNum);
                result.append(" ");
            }
            randomNum += randomProgressionNum;
        }

        question = result.toString();

        String[] data = new String[2];
        data[0] = question;
        data[1] = Integer.toString(rightAnswer);

        return data;
    }

    public String getTask() {
        return "What number is missing in the progression?";
    }
}
