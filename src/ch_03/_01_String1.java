package ch_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and SpringBoot.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함관계
        System.out.println(s.contains("Java"));   // true or false
        System.out.println(s.indexOf("Java"));  //인덱스(위치) 정보 (cf.인덱스는 0부터 시작)  / 미포함의 경우 -1 출력됨
        System.out.println(s.lastIndexOf("and"));  //마지막 위치정보
        System.out.println(s.startsWith("I like"));    //해당 문자열로 시작하는지 여부 ture/false
        System.out.println(s.endsWith("java"));  // 해당 문자욜로 끝나는지 여부 true/false


        //문자열 변환
        System.out.println(s.replace("and", "or"));
        System.out.println(s.substring(7));     //인덱스 기준 7번째 부터 시작하게 앞의 내용 삭제하고 출력 (변수자체가 변하는건 아님)
        System.out.println(s.substring(s.indexOf("Java")));  //indexof로 인덱스 위치 반환, 해당 위치값으로 이전내용 삭제하고 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));     //시작위치, 지정한 위치 전까지 잘라내서 출력


        //공백 제거  s.trim()

        String s1 = "Java";
        String s2 = "Spring";

        //문자 간 결합시 추가
        System.out.println(s1.concat(",".concat(s2)));

    }

}

