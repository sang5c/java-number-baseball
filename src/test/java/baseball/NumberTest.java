package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    @DisplayName("문자열을 받아 객체를 생성한다.")
    @Test
    void ofString() {
        Number number = Number.of("1");
        assertThat(number).isNotNull();
    }
}
