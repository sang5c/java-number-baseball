package baseball;

public class Game {
    private String str;

    public Game(String str) {
        this.str = str;
    }

    public static Game of(String str) {
        if (str.length() != 3) {
            throw new IllegalArgumentException(String.format("length should be 3, input: [%d]", str.length()));
        }
        return new Game(str);
    }

}
