package hexlet.code.games;


public class Progression implements Game {
    private static final int MAX_RANDOM_NUM = 100;
    private static final int MAX_PROGRESSION = 10;
    private static final int MAX_RND_COUNTER = 10;

    public String[] getData() {
        int randomNum = (int) (Math.random() * MAX_RANDOM_NUM) + 1;
        int randomProgressionNum = (int) (Math.random() * MAX_PROGRESSION) + 1;
        var result = new StringBuilder();
        int rightAnswer = 0;
        int randomCounter = (int) (Math.random() * MAX_RND_COUNTER);
        String question;

        for (int i = 0; i < MAX_RND_COUNTER; i++) {
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
