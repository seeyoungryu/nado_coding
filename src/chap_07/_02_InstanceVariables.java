package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        // 처음 만든 블랙박스
        BlackBox b1 = new BlackBox();        //new 이용해서 블랙박스(클래스) 에 대한 객체(인스턴스) 생성
        b1.modelName = "까망이";            //만들어낸 객체에-클래스-쓸수있는 필드 . 으로 사용
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("-------------------");


        // 새로운 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}


// ------------> 만들어낸 두개의 객체만으로 데이터 다 표현함