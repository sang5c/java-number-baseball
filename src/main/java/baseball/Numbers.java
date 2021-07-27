package baseball;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private final List<Number> numbers;

    public Numbers() {
        this.numbers = new ArrayList<>();
    }

    public static Numbers of(String str) {
        return new Numbers();
    }

}
