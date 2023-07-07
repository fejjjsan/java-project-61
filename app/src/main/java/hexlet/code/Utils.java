package hexlet.code;

public class Utils {
    public static int rndNumGenerator(int maxNum, int lowNum) {
        return (int) (Math.random() * maxNum) + lowNum;
    }

    public static char rndOperatorGenerator(char[] charArr) {
        int rndOperator = (int) (Math.random() * charArr.length);
        return charArr[rndOperator];
    }
}
