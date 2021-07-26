package baseball;

public class Number {

    private final int number;

    private Number(int number) {
        this.number = number;
    }

    public static Number of(String str) {
        int number = Integer.parseInt(str);
        return new Number(number);
    }
}
