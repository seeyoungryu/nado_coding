package ch_04;

public class _01_if {
    public static void main(String[] args) {

        //조건문 If
        // if(조건문)           -> 조건문이 true 인 경우 중괄호{} 사이의 문장 실행됨
        //      sout("");
        // sout("");


        int hour = 10;

        if (hour < 14) {
            System.out.println("아이스 아메리카노+1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        hour = 10;
        boolean moringcoffee = false;
        //if (hour < 14 && moringcoffee == false) {
        if (hour < 14 && !moringcoffee)
            System.out.println("아이스아메라키노+1");
    }
    //if(hour>=14  || morningcoffee == true)


}

