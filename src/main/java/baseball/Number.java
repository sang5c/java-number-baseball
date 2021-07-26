package baseball;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
