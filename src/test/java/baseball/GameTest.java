package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class GameTest {

    @DisplayName("세자리 숫자를 받아 게임을 생성")
    @Test
    public void createGame() {
        Game game = Game.of("123");
        assertThat(game).isNotNull();
    }

    @DisplayName("세자리가 아니면 에러")
    @Test
    void invalidGameLength() {
        assertThatIllegalArgumentException().isThrownBy(() -> Game.of("1234"));
    }

}
