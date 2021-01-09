package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final static int BALL_COUNT = 3;
    private List<Ball> balls;

    public Balls(List<Integer> balls) {
//        if(!validateBalls(balls)) {
//            throw new IllegalArgumentException();
//        }
        validateBalls(balls);
        this.balls = new ArrayList<Ball>();
        for (int i = 0; i < balls.size(); i++) {
            this.balls.add(new Ball(i, balls.get(i)));
        }

    }

    public static void validateBalls(List<Integer> balls) {
        if(balls.size() == BALL_COUNT) {
            throw new IllegalArgumentException();
        }
    }


    public BallStatus play(Ball userBall) {
        // reference Method
        return this.balls.stream()
                .map(ball -> ball.compare(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(Balls comBalls) {
        // FIXME: reference Method && userBalls
        List<Ball> userBalls = this.balls;
        PlayResult playResult = new PlayResult(this);
        for(Ball ball: userBalls) {
            playResult.reportPlayResult(comBalls.play(ball));
        }
        return playResult;
    }

    // 1 2 3
    // (0, 2) << userBall
    //for(int i = 0; i < balls.size(); i++) {
    //  balls.get(i).compare(userBall); << nothing, strike, ball
    //}
    // 3번 판정해서, 3번다 nothing > return nothing
    // 1번이라도, strike 혹은 ball이 뜨면, return strike , ball

}
