package baseball;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {
    @Test
    public void ballTest () {
        Ball comBall = new Ball(0, 1);
        Ball userBall = new Ball(1, 1);
        BallStatus.BALL
        assertThat(comBall.compare(userBall)).isEqualTo(1);
    }
}
