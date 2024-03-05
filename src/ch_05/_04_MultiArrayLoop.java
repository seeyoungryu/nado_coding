package ch_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { // 가로
                System.out.print(seats[i][j] + " "); // A1 A2 A3...
            }
            System.out.println();
        }

        System.out.println("----------------------");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { // 가로
                System.out.print(seats2[i][j] + " "); // A1 A2 A3...
            }
            System.out.println();
        }


        //2차원 배열에서 배열명.length는 배열의 행의 개수(세로 크기)를 반환하고, 배열명[i].length는 i번째 행의 열의 개수(가로 크기)를 반환합니다.
        // 이 경우에는 모든 행이 동일한 길이인 15를 가지므로, seats3[i].length는 어떤 i에 대해서도 15의 값을 가집니다.


        System.out.println("---------------------");
        // 세로 크기 10 x 가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표 구매
        seats3[7][8] = "__"; // H9
        seats3[7][9] = "___"; // H10

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                System.out.print(seats3[i][j] + " "); // A1 A2 A3...
            }
            System.out.println();
        }
    }
}
