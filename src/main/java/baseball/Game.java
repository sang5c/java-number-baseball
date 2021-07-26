package baseball;

public class Game {
    private String str;

    public Game(String str) {
        this.str = str;
    }

    public static Game of(String str) {
        return new Game(str);
    }

}
