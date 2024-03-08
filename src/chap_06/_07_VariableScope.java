package chap_06;


public class _07_VariableScope {
    public static void methodA(int number) {
    }

    //메소드를 호출하는 쪽에서 매개변수의 이름은 다를 수 있음

    public static void methodB() {
        int result = 1; // 지역 변수
    }
    //지역변수-> 그 변수가 선언된 영역 - 중괄호 내에서만 사용할 수 있음   >> 전달값으로 사용?


    public static void main(String[] args) {
        int number = 3;

        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
}
