package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    // TODO: 필드가 많다.
    private static final int NUMBERS_LENGTH = 3;
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
        for (String s : split) {
            numbers.add(Number.of(s, 0));
        }
        return Collections.unmodifiableList(numbers);
    }

    private static boolean isValidLength(List<Number> numbers) {
        return numbers.size() != NUMBERS_LENGTH;
    }

    // TODO: 길고, 깊다.
    public Score compare(String targetNumbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < this.numbers.size(); i++) {
            List<Number> target = convertToNumbers(targetNumbers);
            for (int k = 0; k < target.size(); k++) {
                if (isStrike(this.numbers.get(i), i, target.get(k), k)) {
                    strike++;
                }
                if (isBall(this.numbers.get(i), i, target.get(k), k)) {
                    ball++;
                }
            }
        }
        return new Score(strike, ball);
    }

    // TODO: 매개변수가 많다.
    private boolean isStrike(Number source, int i, Number target, int k) {
        return samePosition(i, k) && sameValue(source, target);
    }

    private boolean isBall(Number source, int i, Number target, int k) {
        return !samePosition(i, k) && sameValue(source, target);
    }

    private boolean sameValue(Number source, Number target) {
        return source.equals(target);
    }

    private boolean samePosition(int i, int k) {
        return i == k;
    }

}
