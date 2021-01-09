package baseball;

import baseball.domain.Balls;
import baseball.domain.PlayResult;
import baseball.view.BaseballView;

import java.util.*;

public class Main {

    public static List<Integer> generateDistinctRandomNumber() {
        List<Integer> origin = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 8, 9));
        Collections.shuffle(origin);
        return origin.subList(0, Balls.BALL_COUNT);
    }

    public static void main(String[] args) {
        BaseballView.printGameStart();
        do {
            playGame();
        } while (BaseballView.printWinner());
    }

    private static void playGame() {
        Balls comBalls = new Balls(generateDistinctRandomNumber());
        PlayResult playResult;
        do {
            Balls userBalls = new Balls(BaseballView.inputBalls());
            playResult = userBalls.play(comBalls);
            BaseballView.printPlayResultCount(playResult);
        } while(!playResult.isEndGame());
    }

}
