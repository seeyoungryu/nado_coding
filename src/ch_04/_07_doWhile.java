package ch_04;

public class _07_doWhile {
    public static void main(String[] args) {


        //do while
//        조건을 검사하기 전에 루프 내부의 코드 블록을 최소 한 번 실행
//
//                do{
//                    ...코드블록...
//                }while (조건);

        int i = 1;

        do {
            System.out.println(i);  //현재 숫자 출력
            i++;                 //i를 1씩 증가
        } while (i <= 5);       //조건
    }
}
