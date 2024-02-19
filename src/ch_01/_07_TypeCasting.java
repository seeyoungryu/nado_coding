package ch_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // ex) 정수형 -> 실수형, 실수형 -> 정수형


        int score = 93;
        System.out.println(score); // 93

        //-> 앞에 (float) 을 붙여서 형변환 함
        System.out.println((float) score); // 93.0

        //정수와 실수의 계산인 경우 double

        //*자동형변환
        //int -> long -> float -> double


        // * 숫자를 문자열로 변환 *
        String s1 = String.valueOf(93);
        // - 여러타입의 데이터 처리에는 String.valueOf 사용

        s1 = Integer.toString(93);
        // - Integer 클래스 이므로 정수만 문자열로 반환함
        // - 'null' 값 처리 불가


        // * 문자열을 숫자로 변환*
        int i = Integer.parseInt("93");
        System.out.println(i);    //93
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

    }
}
