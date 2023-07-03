package hexlet.code.games;

public class Prime implements Game {
    private static final int MAX_RND_NUMBER = 500;

    public String[] getData() {
        int randomNum = (int) (Math.random() * MAX_RND_NUMBER) + 2;
        int divider = 2;
        int maxDivider = (int) Math.sqrt(randomNum);
        String question = "Question: " + randomNum;
        String rightAnswer;

        do {
            if (randomNum % divider != 0 || randomNum == 2) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
                break;
            }
            divider++;
        } while (divider <= maxDivider);

        String[] data = new String[2];
        data[0] = question;
        data[1] = rightAnswer;

        return data;
    }

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}

