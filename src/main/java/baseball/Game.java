package baseball;

public class Game {
    // TODO: 필드가 많다.
    public static final int GAME_LENGTH = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public static final String SPLIT_REGEX = "";
    public static final String OUT_OF_RANGE_STR = "range should be 1-9, input: [%s]";
    public static final String INVALID_LENGTH_STR = "length should be 3, input: [%d]";
    public static final String NUMBER_SPLIT_REGEX = "";
    private final String numbers;

    private Game(String numbers) {
        this.numbers = numbers;
    }

    public static Game of(String str) {
        validate(str);
        return new Game(str);
    }

    private static void validate(String str) {
        validateLength(str);
        validateRange(str);
    }

    private static void validateRange(String str) {
        String[] split = str.split(SPLIT_REGEX);
        for (String s : split) {
            int number = Integer.parseInt(s);
            if (isOutOfRange(number)) {
                throw new IllegalArgumentException(String.format(OUT_OF_RANGE_STR, s));
            }
        }
    }

    private static boolean isOutOfRange(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    private static void validateLength(String str) {
        if (isValidLength(str))
            throw new IllegalArgumentException(String.format(INVALID_LENGTH_STR, str.length()));
    }

    private static boolean isValidLength(String str) {
        return str.length() != GAME_LENGTH;
    }

    // TODO: 길고, 깊다.
    public Score compare(String targetNumbers) {
        int strike = 0;
        int ball = 0;

        String[] source = this.numbers.split("");
        for (int i = 0; i < source.length; i++) {
            String[] target = targetNumbers.split(NUMBER_SPLIT_REGEX);
            for (int k = 0; k < target.length; k++) {
                if (isStrike(source, i, target, k)) {
                    strike++;
                }
                if (isBall(source, i, target, k)) {
                    ball++;
                }
            }
        }
        return new Score(strike, ball);
    }

    // TODO: 매개변수가 많다.
    private boolean isStrike(String[] source, int i, String[] target, int k) {
        return samePosition(i, k) && sameValue(source[i], target[k]);
    }

    private boolean isBall(String[] source, int i, String[] target, int k) {
        return !samePosition(i, k) && sameValue(source[i], target[k]);
    }
    private boolean sameValue(String source, String target) {
        return source.equals(target);
    }

    private boolean samePosition(int i, int k) {
        return i == k;
    }

}
