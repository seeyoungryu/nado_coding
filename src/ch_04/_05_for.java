package ch_04;

public class _05_for {
    public static void main(String[] args) {
        //for 문 기본
        //for (선언(초기값); 조건; 증가치(증감시키는값)){}
        for (int i = 0; i < 10; i++) {
            //i<10 (조건에 맞을 경우) ....수행하는 명령....
            System.out.println("반복문 테스트" + i);
        }


        //짝수만 출력       (j+=2      ==    j=j+2  ->씩 증가)
        for (int j = 0; j < 10; j += 2) {
            System.out.println("반복문 짝수 테스트" + j);
        }


        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print("반복문 홀수 테스트" + i);
        }

        //역순 숫자 출력 :5,4,3,2,1
        for (int i = 5; i > 0; i--) {
            System.out.print("반복문 역순 출력" + i);
        }

        //1부터 10까지 수의 합 =55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 총 합은 : " + sum);
        }
        System.out.println("모든 수의 총합은 : " + sum);
    }
}
