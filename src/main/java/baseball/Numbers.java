package baseball;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static final int NUMBERS_LENGTH = 3;
    private static final String INVALID_LENGTH_STR = "length should be 3, input: [%d]";

    private final List<Number> numbers;

    private Numbers() {
        this.numbers = new ArrayList<>();
    }

    public static Numbers of(String str) {
        if (str.length() != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(String.format(INVALID_LENGTH_STR, str.length()));
        }
        return new Numbers();
    }

}
