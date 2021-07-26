package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ScoreTest {

    @DisplayName("스트라이크와 볼을 받아 객체를 생성한다.")
    @Test
    void createScore() {
        Score score = new Score(1, 2);
        assertThat(score).isNotNull();
    }

    @DisplayName("스트라이크와 볼이 같다면 같은 객체를 반환한다")
    @Test
    void equalsAndHashcode() {
        Score score = new Score(1, 2);
        assertThat(score).isEqualTo(new Score(1, 2));
    }

    @DisplayName("스트라이크는 0-3 숫자가 아니면 Exception이 발생한다.")
    @Test
    void strikeNumberRangeZeroToThree() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Score(4, 0));
        assertThatIllegalArgumentException().isThrownBy(() -> new Score(-1, 0));
    }

}
