package ch_04;

public class _10_break {
    public static void main(String[] args) {
        //Break
        //ex) 커피를 매일 20잔만 판매할 수 있음 핸드드립임 (1인당 1잔만 구매 가능)
        //손님 100명 대기

        //for문
        int max = 20;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "번 손님, 주문하신 핸드드립 커피 나왔습니다");
            if (i == max) {
                System.out.println("죄송하지만 준비된 원두 품절로 금일 판매를 마감합니다");
                break;   //이 브레이크가 속한 반복문을 빠져나가기   -- 어떤 조건을 만나서 반복문 탈출하면 될 때 쓰면 됨
            }
        }
        System.out.println("나가주세요");


        //while 문
        int index = 1; //손님 대기번호
        while (index <= 20) {
            System.out.println(index + " 번 손님 축하합니다 커피 받아가세요");
            if (index == max) {
                System.out.println("준비된 재료가 소진되었습니다. 금일 영업을 마감합니다. 양해부탁드립니다. :)");
            }
            index++;
        }
    }

}
