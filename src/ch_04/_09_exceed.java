package ch_04;

public class _09_exceed {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {              //외부루프 : 구구단 2단~9단
            System.out.println(i + "단");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        System.out.println();
    }
}
