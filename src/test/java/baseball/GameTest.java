package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void CreateGame() {
        Game game = Game.of("123");
        assertThat(game).isNotNull();
    }

}
