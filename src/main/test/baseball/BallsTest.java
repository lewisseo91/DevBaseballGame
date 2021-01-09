package baseball;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {

    @Test
    public void strikesTest () {
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(0, 1);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
        // [1,2,3]
    }

    @Test
    public void ballsTest () {
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(1, 1);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
        // [1,2,3]
    }

    @Test
    public void nothingsTest () {
        Balls balls = new Balls(List.of(1,2,3));
        Ball userBall = new Ball(0, 4);
        BallStatus ballStatus = balls.play(userBall);
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
        // [1,2,3]
    }

    @Test
    public void playResult3StrikesTest () {
        Balls comBalls = new Balls(List.of(1,2,3));
        Balls userBalls = new Balls(List.of(1,2,3));
        PlayResult playResult = userBalls.play(comBalls);
        assertThat(playResult.getStrikeCount()).isEqualTo(3);
        assertThat(playResult.getBallCount()).isEqualTo(0);
        assertThat(playResult.getNothingCount()).isEqualTo(0);
        // [1,2,3]
    }

    @Test
    public void playResult1Ball1StrikeTest () {
        Balls comBalls = new Balls(List.of(1,2,3));
        Balls userBalls = new Balls(List.of(1,3,9));
        PlayResult playResult = userBalls.play(comBalls);
        assertThat(playResult.getStrikeCount()).isEqualTo(1);
        assertThat(playResult.getBallCount()).isEqualTo(1);
        assertThat(playResult.getNothingCount()).isEqualTo(1);
        // [1,2,3]
    }

    @Test
    public void playResult1Strike2BallTest () {
        Balls comBalls = new Balls(List.of(1,2,3));
        Balls userBalls = new Balls(List.of(3,2,1));
        PlayResult playResult = userBalls.play(comBalls);
        assertThat(playResult.getStrikeCount()).isEqualTo(1);
        assertThat(playResult.getBallCount()).isEqualTo(2);
        assertThat(playResult.getNothingCount()).isEqualTo(0);
        // [1,2,3]
    }

    @Test
    public void playResultNothingTest () {
        Balls comBalls = new Balls(List.of(1,2,3));
        Balls userBalls = new Balls(List.of(7,8,9));
        PlayResult playResult = userBalls.play(comBalls);
        assertThat(playResult.getStrikeCount()).isEqualTo(0);
        assertThat(playResult.getBallCount()).isEqualTo(0);
        assertThat(playResult.getNothingCount()).isEqualTo(3);
        // [1,2,3]
    }


}
