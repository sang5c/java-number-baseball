package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static baseball.Game.of;
import static org.assertj.core.api.Assertions.*;

public class GameTest {

    @DisplayName("세자리 숫자를 받아 게임을 생성")
    @Test
    public void createGame() {
        Game game = of("123");
        assertThat(game).isNotNull();
    }

    @DisplayName("세자리가 아니면 에러")
    @Test
    void invalidGameLength() {
        assertIllegalArgumentException("1234");
        assertIllegalArgumentException("23");
    }
    
    @DisplayName("숫자, 범위는 1~9")
    @Test
    void invalidNumber() {
        assertIllegalArgumentException("023");
        assertIllegalArgumentException("12#");
        assertIllegalArgumentException("1A3");
    }

    private void assertIllegalArgumentException(String str) {
        assertThatIllegalArgumentException().isThrownBy(() -> of(str));
    }

    @DisplayName("숫자가 일치하지 않으면 nothing")
    @Test
    void nothing() {
        Game game = of("123");
        Score score = game.compare("456");
        assertThat(score).isEqualTo(new Score(0, 0));
    }

    @DisplayName("숫자와 자리가 일치하면 strike")
    @Test
    void sameNumberAndSamePositionIsStrike() {
        Game game = of("123");
        assertThat(game.compare("123")).isEqualTo(new Score(3, 0));
        assertThat(game.compare("143")).isEqualTo(new Score(2, 0));
        assertThat(game.compare("425")).isEqualTo(new Score(1, 0));
    }

}
