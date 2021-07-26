package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

}
