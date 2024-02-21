package ch_04;

public class _02_else {
    public static void main(String[] args) {
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노+1");
        } else if (hour > 2) {
            System.out.println("예시");
        } else {
            System.out.println("마지막예시");
        }
        System.out.println("if문 빠져나오기");
    }
    //else 없어도 됨
    
}
