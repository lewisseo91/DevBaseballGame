package baseball;

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
            return;
        }

        if(ballStatus == BallStatus.BALL) {
            this.ballCount++;
            return;
        }

        if(ballStatus == BallStatus.NOTHING) {
            this.nothingCount++;
            return;
        }
    }

    public int getStrikeCount() { return strikeCount; }

    public int getBallCount() { return ballCount; }

    public int getNothingCount() { return nothingCount; }
}
