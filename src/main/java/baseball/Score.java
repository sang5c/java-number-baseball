package baseball;

import java.util.Objects;

public class Score {
    // TODO: 필드가 많다.
    public static final int MIN_STRIKE_AND_BALL = 0;
    public static final int MAX_STRIKE_AND_BALL = 3;
    public static final String STRIKE_BALL_RANGE_EXCEPTION_STR = "strike, ball range 0-3, input: [%d, %d]";
    public static final int MAX_SUM_OF_STRIKE_AND_BALL = 3;
    private static final String STRIKE_BALL_SUM_EXCEPTION_STR = "sum of strike and ball up to 3, input: [%d]";
    private int strike;
    private int ball;

    public Score(int strike, int ball) {
        validateStrikeAndBall(strike, ball);
        this.strike = strike;
        this.ball = ball;
    }

    private void validateStrikeAndBall(int strike, int ball) {
        if (isValidRange(strike) || isValidRange(ball)) {
            throw new IllegalArgumentException(String.format(STRIKE_BALL_RANGE_EXCEPTION_STR, strike, ball));
        }
        if (strike + ball > MAX_SUM_OF_STRIKE_AND_BALL) {
            throw new IllegalArgumentException(String.format(STRIKE_BALL_SUM_EXCEPTION_STR, strike + ball));
        }
    }

    private boolean isValidRange(int value) {
        return value > MAX_STRIKE_AND_BALL || value < MIN_STRIKE_AND_BALL;
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
