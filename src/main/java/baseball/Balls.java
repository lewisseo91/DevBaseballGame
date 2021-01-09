package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;
    public Balls(List<Integer> balls) {
        this.balls = new ArrayList<Ball>();
        for (int i = 0; i < balls.size(); i++) {
            this.balls.add(new Ball(i, balls.get(i)));
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
//
//    public boolean comparePlay(int pos, int val) {
//        return this.balls.get(pos)
//    }
    // 1 2 3
    // (0, 2) << userBall
    //for(int i = 0; i < balls.size(); i++) {
    //  balls.get(i).compare(userBall); << nothing, strike, ball
    //}
    // 3번 판정해서, 3번다 nothing > return nothing
    // 1번이라도, strike 혹은 ball이 뜨면, return strike , ball

}
