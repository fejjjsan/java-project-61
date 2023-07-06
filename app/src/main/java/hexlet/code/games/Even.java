package hexlet.code.games;

public class Even implements Game {
    private static final int MAX_RND_NUMBER = 10;
    public String[] getData() {
        int randomNum = (int) (Math.random() * MAX_RND_NUMBER) + 1;
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


