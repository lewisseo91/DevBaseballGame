package baseball.view;

import baseball.domain.PlayResult;

import java.util.Scanner;

public class BaseballView {

    private static Scanner scan = new Scanner(System.in);

    public static void printGameStart() {
        System.out.println("숫자 야구에 오신 것을 환영합니다.");
    }

    public static int inputBalls() {
        System.out.println("숫자를 입력해주세요");
        return scan.nextInt();
    }

    public static void printPlayResultCount(PlayResult playResult) {
        System.out.println(playResult.toString());
    }

    public boolean printWinner() {
        System.out.println("축하합니다.");
        System.out.println("다시 시작하려면 1을 눌러주세요. 다시 시작 하지 않으려면 다른 것을 눌러주세요.");
        return scan.nextInt() == 1;
    }

}
