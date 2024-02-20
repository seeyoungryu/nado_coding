package ch_03;

public class _02_StringCompare {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Spring";

        //문자열 비교
        System.out.println(s1.equals("Java"));   //  ture, false
        System.out.println(s2.equalsIgnoreCase("java"));  //대소문자 구분 x , true/false

        //심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2));      //* 내용비교 *
        System.out.println(s1 == s2);           //* 참조 *

        //중요
        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2));   //* true *
        System.out.println(s1 == s2);        //* false *    *참조의 개념이기 떄문에!

    }
}
