package baseball.view;

import baseball.domain.Balls;
import baseball.domain.PlayResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BaseballView {

    private static Scanner scan = new Scanner(System.in);

    public static void printGameStart() {
        System.out.println("숫자 야구에 오신 것을 환영합니다.");
    }

    public static List<Integer> inputBalls() {
        List<Integer> result;

        do {
            System.out.println("숫자를 입력해주세요");
            result = convertStringToListInt(scan.nextLine());
        } while( !checkValidation(result) );

        return result;
    }

    private static List<Integer> convertStringToListInt(String input) {

        try {
            return Arrays.stream(input.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    private static boolean checkValidation(List<Integer> input) {
        try {
            Balls.validateBalls(input);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("잘못된 숫자 입니다");
            return false;
        }
        return true;
    }

    public static void printPlayResultCount(PlayResult playResult) {
        System.out.println(playResult.toString());
    }

    public static boolean printWinner() {
        System.out.println("축하합니다.");
        System.out.println("다시 시작하려면 1을 눌러주세요. 다시 시작 하지 않으려면 다른 것을 눌러주세요.");
        return Integer.parseInt(scan.nextLine()) == 1;
    }

}
