package ch_04;

public class _04_switchCase {
    public static void main(String[] args) {

        //SwitchCase 문
        int ranking = 1;

        switch (ranking) {                            // (ranking)의 값이 어느 케이스에 해당하는지 확인하는 것임
            case 1:
                System.out.println("전액 장학급");
                break;

            case 2:
                System.out.println("반액 장학금");
                break;

//            case 2:
            //case 3:                               (case2,3 모두 해당 break 없이)
//                System.out.println("반액 장학금");
//                break;

            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");

    }
}


//if else : 범위에 해당하는 ~ , switch: 명확한 케이스가 있는 경우 (ex 명확한 에러코드..?)
