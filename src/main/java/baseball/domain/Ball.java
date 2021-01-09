package baseball.domain;

import java.util.Objects;

public class Ball {
    private int pos;
    private int val;

    public Ball(int pos, int val) {
        this.pos = pos;
        this.val = val;
    }

    public BallStatus compare(Ball userBall) {
        if(userBall.equals(this)) {
            return BallStatus.STRIKE;
        }

        if(userBall.matchBallVal(this.val)) { /* 중요 */
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean matchBallVal(int val) {
        return this.val == val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return pos == ball.pos &&
                val == ball.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos, val);
    }
}
