package ch_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        //증감연산
        // val++ = val + 1;
        // ++val = 1+val;

        int val = 10;
        System.out.println(val);    //10
        System.out.println(++val);   //11        ->  val +1 값을 출력하는 것임
        System.out.println(val);  //11

        val = 10;
        System.out.println(val);   //10
        System.out.println(val++); //10, val=11 이 됨
        System.out.println(val);  //11


    }
}
