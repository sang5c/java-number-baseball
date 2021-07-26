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
        assertIllegalArgumentException(4, 0);
        assertIllegalArgumentException(-1, 0);
    }

    @DisplayName("볼은 0-3 숫자가 아니면 Exception이 발생한다.")
    @Test
    void ballNumberRangeZeroToThree() {
        assertIllegalArgumentException(0, 4);
        assertIllegalArgumentException(0, -1);
    }
    
    @DisplayName("볼과 스트라이크의 합은 최대 3이다.")
    @Test
    void sumOfBallAndStrikeUpToThree() {
        assertIllegalArgumentException(2, 2);
    }

    private void assertIllegalArgumentException(int strike, int ball) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Score(strike, ball));
    }

}
