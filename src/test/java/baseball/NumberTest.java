package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class NumberTest {

    @DisplayName("문자열을 받아 객체를 생성한다.")
    @Test
    void ofString() {
        Number number = Number.of("1");
        assertThat(number).isNotNull();
    }

    @DisplayName("1-9 숫자가 아니면 Exception이 발생한다.")
    @Test
    void invalidNumber() {
        assertThatIllegalArgumentException().isThrownBy(() -> Number.of("0"));
        assertThatIllegalArgumentException().isThrownBy(() -> Number.of("#"));
        assertThatIllegalArgumentException().isThrownBy(() -> Number.of("10"));
    }

    @DisplayName("숫자가 같다면 같은 객체를 반환한다.")
    @Test
    void equalsAndHashcode() {
        assertThat(Number.of("1")).isEqualTo(Number.of("1"));
    }
}
