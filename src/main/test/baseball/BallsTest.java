package baseball;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {

    @Test
    public void strikesTest () {
        List<Integer> a = List.of(1,2,3);
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(0, 1);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
        // [1,2,3]
    }

    @Test
    public void ballsTest () {
        List<Integer> a = List.of(1,2,3);
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(1, 1);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
        // [1,2,3]
    }

    @Test
    public void nothingsTest () {
        List<Integer> a = List.of(1,2,3);
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(0, 4);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
        // [1,2,3]
    }
}
