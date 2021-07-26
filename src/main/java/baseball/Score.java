package baseball;

import java.util.Objects;

public class Score {
    private int strike;
    private int ball;

    public Score(int strike, int ball) {
        if (strike > 3 || strike < 0)
            throw new IllegalArgumentException(String.format("stirke range 0-3, input: [%d]", strike));
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return strike == score.strike && ball == score.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strike, ball);
    }

}
