package chap_06;


//*메소드 오버로딩: 같은 이름의 메소드, 다른 전달값 (전달값의 타입/갯수)으로 여러번 선언하는 것

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {   //getPower메소드 정의, 반환값 Int, 파라미터값 String)
        int number = Integer.parseInt(strNumber);    //number 변수에 strMumber를 int 값으로 파싱 (parsing)
        return number * number;                      //제곱 값을 반환
    }


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
