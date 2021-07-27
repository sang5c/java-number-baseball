package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {
    
    @DisplayName("숫자 세개로된 문자열을 받아 객체를 반환")
    @Test
    void create() {
        Numbers numbers = Numbers.of("123");
        assertThat(numbers).isNotNull();
    }
}
