package ch_04;

public class _11_continue {
    public static void main(String[] args) {
        //continue

        //조앤도슨 프렌치토스트 예약 해두고 노쇼 손님이 발생함
        int max = 20; //최대 판매 가능 수량
        int sold = 0;   //현재까지 판매된 수량
        int noShow = 17; //노쇼 손님 대기 번호

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 예약하신 조앤도슨에 입장 가능합니다. 빠르게 매장에 방문해주세요");

            //노쇼 발생
            if (i == noShow) {
                System.out.println(i + "번 대기 고객님은 노쇼로 추후 매장 방문이 어렵습니다.");
                continue;
            }
            sold++; //판매 처리

            if (sold == max) {
                System.out.println("준비된 재료 소진으로 금일 예약이 마감되었습니다");
                break;
            }
        }
        System.out.println("예약을 마감합니다");
    }
}
