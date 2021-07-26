package baseball;

public class Game {
    public static final int GAME_LENGTH = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public static final String SPLIT_REGEX = "";
    public static final String OUT_OF_RANGE_STR = "range should be 1-9, input: [%s]";
    public static final String INVALID_LENGTH_STR = "length should be 3, input: [%d]";
    private final String str;

    private Game(String str) {
        this.str = str;
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

}
