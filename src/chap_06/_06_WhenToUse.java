package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }

    // 직접 계산을 하지 않고, 대신 또 다른 getPower 메소드를 호출하여 이 일을 처리합니다.
    // 호출할 때는 받은 숫자와 함께 '2'라는 두 번째 숫자를 같이 보냅니다.
    // 이렇게 함으로써 "이 숫자를 2번 곱해주세요"라고 요청하는 것과 같습니다.


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}
