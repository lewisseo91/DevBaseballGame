package baseball;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {
    @Test
    public void strikeTest () {
        Ball comBall = new Ball(1, 1);
        Ball userBall = new Ball(1, 1);
        BallStatus ballStatus = comBall.compare(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }
    @Test
    public void ballTest () {
        Ball comBall = new Ball(0, 1);
        Ball userBall = new Ball(1, 1);
        BallStatus ballStatus = comBall.compare(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }
    @Test
    public void nothingTest () {
        Ball comBall = new Ball(0, 1);
        Ball userBall = new Ball(0, 0);
        BallStatus ballStatus = comBall.compare(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }
}
