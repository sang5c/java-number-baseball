package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @DisplayName("세자리 숫자를 받아 게임을 생성")
    @Test
    public void CreateGame() {
        Game game = Game.of("123");
        assertThat(game).isNotNull();
    }

}
