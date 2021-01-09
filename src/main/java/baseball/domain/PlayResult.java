package baseball.domain;

public class PlayResult {
    // TODO: 초기화 안하고 값 넣었을 시 0으로 되는 지 테스트
    private int strikeCount = 0;
    private int ballCount = 0;
    private int nothingCount = 0;
    public PlayResult(Balls balls) {
    }

    public void reportPlayResult(BallStatus ballStatus) {
        if(ballStatus == BallStatus.STRIKE) {
            this.strikeCount++;
        }

        if(ballStatus == BallStatus.BALL) {
            this.ballCount++;
        }

        if(ballStatus == BallStatus.NOTHING) {
            this.nothingCount++;
        }
    }

    public boolean isEndGame() {
        return this.strikeCount == 3;
    }

    public int getStrikeCount() { return strikeCount; }

    public int getBallCount() { return ballCount; }

    public int getNothingCount() { return nothingCount; }

    @Override
    public String toString() {
        if(strikeCount == 0 && ballCount == 0)
            return "nothing";

        return "{" +
                "strikeCount=" + strikeCount +
                ", ballCount=" + ballCount +
                '}';
    }
}
