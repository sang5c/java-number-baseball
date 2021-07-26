package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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
    
    @DisplayName("숫자, 범위는 1~9")
    @Test
    void invalidNumber() {
        assertThatIllegalArgumentException().isThrownBy(() -> Game.of("023"));
        assertThatIllegalArgumentException().isThrownBy(() -> Game.of("12#"));
        assertThatIllegalArgumentException().isThrownBy(() -> Game.of("1A3"));
    }

}
