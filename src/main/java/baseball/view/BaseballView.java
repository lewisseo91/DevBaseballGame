package baseball.view;

import baseball.domain.PlayResult;

import java.util.Scanner;

public class BaseballView {
    private static Scanner scan = new Scanner(System.in);
    //  - 게임 시작 인트로
    public static void printGameStart() {
        System.out.println("숫자 야구에 오신 것을 환영합니다.");
    }
    //  - 숫자 인풋
    public static int inputBalls() {
        System.out.println("숫자를 입력해주세요");
        return scan.nextInt();
    }
    //  - 볼 스트라이크 개수
    public static void printPlayResultCount(PlayResult playResult) {
        System.out.println(playResult.toString());
    }
    //  - 축하합니다
    //  - 다시 시작 인풋
    public boolean printWinner() {
        System.out.println("축하합니다.");
        System.out.println("다시 시작하려면 1을 눌러주세요. 다시 시작 하지 않으려면 다른 것을 눌러주세요.");
        return scan.nextInt() == 1;
    }
}
