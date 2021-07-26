package baseball;

public class Number {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final String OUT_OF_RANGE_STR = "range should be 1-9, input: [%d]";

    private final int number;

    private Number(int number) {
        this.number = number;
    }

    public static Number of(String str) {
        int number = Integer.parseInt(str);
        if (number > MAX_NUMBER || number < MIN_NUMBER) {
            throw new IllegalArgumentException(String.format(OUT_OF_RANGE_STR, number));
        }
        return new Number(number);
    }

}
