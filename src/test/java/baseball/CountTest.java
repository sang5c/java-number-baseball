package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountTest {

    @DisplayName("숫자를 받아 객체를 생성한다")
    @Test
    void createCount() {
        Count count = new Count(0);
        assertThat(count).isNotNull();
    }

}
