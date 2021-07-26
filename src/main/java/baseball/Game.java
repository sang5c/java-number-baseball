package baseball;

public class Game {
    public static final int GAME_LENGTH = 3;
    private String str;

    public Game(String str) {
        this.str = str;
    }

    public static Game of(String str) {
        validateLength(str);

        String[] split = str.split("");
        for (String s : split) {
            int number = Integer.parseInt(s);
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException(String.format("range should be 1-9, input: [%s]", s));
            }
        }
        return new Game(str);
    }

    private static void validateLength(String str) {
        if (isValidLength(str))
            throw new IllegalArgumentException(String.format("length should be 3, input: [%d]", str.length()));
    }

    private static boolean isValidLength(String str) {
        return str.length() != GAME_LENGTH;
    }

}
