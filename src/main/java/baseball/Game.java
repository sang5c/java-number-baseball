package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    // TODO: 필드가 많다.
    public static final int NUMBERS_LENGTH = 3;
    private static final String INVALID_LENGTH_STR = "length should be 3, input: [%d]";
    private static final String NUMBER_SPLIT_REGEX = "";
    private final List<Number> numbers;

    private Game(List<Number> numbers) {
        this.numbers = numbers;
    }

    public static Game of(String str) {
        List<Number> numbers = convertToNumbers(str);
        if (isValidLength(numbers)) {
            throw new IllegalArgumentException(String.format(INVALID_LENGTH_STR, str.length()));
        }
        return new Game(convertToNumbers(str));
    }

    private static List<Number> convertToNumbers(String str) {
        List<Number> numbers = new ArrayList<>();
        String[] split = str.split(NUMBER_SPLIT_REGEX);
        for (int i = 0; i < split.length; i++) {
            numbers.add(Number.of(split[i], i));
        }
        return Collections.unmodifiableList(numbers);
    }

    private static boolean isValidLength(List<Number> numbers) {
        return numbers.size() != NUMBERS_LENGTH;
    }

    // TODO: 길고, 깊다.
    public Score compare(String str) {
        Score score = Score.zero();
        for (Number source : this.numbers) {
            List<Number> targetNumbers = convertToNumbers(str);
            for (Number target : targetNumbers) {
                score = score.increaseCount(source.compare(target));
            }
        }
        return score;
    }

}
