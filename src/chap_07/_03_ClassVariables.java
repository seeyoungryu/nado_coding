package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;

        //
        //
        //*static 필드에 접근할때는 클래스의 모든 인스턴스가 공유하는 값을 의미하므로
        //명확성/일관성/코드분석 경고 방지 등을 위해 클래스.필드값 으로 쓰는것을 권장


        System.out.println(" - 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 권장
    }
}


//STATIC****** : static 변수는 클래스에 속하며 모든 인스턴스가 동일한 값을 공유합니다. 이러한 특성 때문에 static 변수를 클래스 변수라고도 부릅니다.
//
//static 변수의 값을 변경하는 것은 완전히 가능하며, 이 변경은 모든 인스턴스에 대해 적용됩니다.
//요약하자면, BlackBox 클래스의 canAutoReport가 static으로 선언되어 있기 때문에,
// 이 변수의 값을 변경하는 것은 클래스에 속한 모든 객체에 영향을 미치며, 이는 완전히 정상적이고 의도된 동작입니다.