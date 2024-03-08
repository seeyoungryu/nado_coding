package chap_07;

//생성자 -> 객체가 생성될 때 자동으로 호출 메소드

//생성자와 `this` 키워드의 역할과 사용 이유를 이해하는 것은 객체 지향 프로그래밍을 배우는 데 중요한 부분입니다.
// 여기서 `BlackBox` 클래스를 예로 들면서 설명하겠습니다.
//
//### 생성자(Constructor)의 역할
//생성자는 객체가 생성될 때 자동으로 호출되는 특별한 메소드입니다.
// 객체의 초기 상태를 설정하기 위해 필요한 코드를 실행합니다.
// 즉, 객체가 사용되기 전에 필요한 초기화 작업을 수행합니다.
//
//- **기본 생성자(Default Constructor)**: 매개변수가 없는 생성자입니다.
// 클래스에 생성자를 명시적으로 정의하지 않으면, 자바는 기본 생성자를 제공합니다.
// 예를 들어, `BlackBox b1 = new BlackBox();`에서 `BlackBox()`는 `BlackBox` 클래스의 기본 생성자를 호출합니다.

//- **매개변수가 있는 생성자(Parameterized Constructor)**:
// 하나 이상의 매개변수를 가진 생성자로, 객체를 생성할 때 초기값을 전달할 수 있습니다.
// 예: `BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
// `는 `BlackBox` 클래스의 매개변수가 있는 생성자를 호출하며, 각각의 초기값을 객체에 할당합니다.
//
//### `this` 키워드의 사용 이유
//- **현재 객체에 대한 참조**: `this`는 현재 객체, 즉 메소드나 생성자가 호출된 인스턴스를 가리킵니다.
// 클래스 내부에서 필드(변수)나 다른 메소드를 참조할 때 사용합니다.

//- **필드와 매개변수 이름 구별**: 클래스의 필드와 생성자 또는 메소드의 매개변수 이름이 같을 경우,
// `this`를 사용하여 둘을 명확히 구분합니다.
// 예를 들어, `this.modelName = modelName;`에서 `this.modelName`은 클래스 필드를, `modelName`은 생성자나 메소드의 매개변수를 가리킵니다.
//

//### 예제 설명

//public BlackBox(String modelName, String resolution, int price, String color) {
//    this.modelName = modelName;
//    this.resolution = resolution;
//    this.price = price;
//    this.color = color;
//}
//```
//이 생성자에서 `this.modelName = modelName;`는 생성자로 전달된 `modelName` 매개변수의 값을 현재 객체의 `modelName` 필드에 할당합니다.
// `this`를 사용함으로써 매개변수와 클래스 필드 사이의 이름 충돌을 해결하고, 매개변수의 값을 해당 객체의 필드에 올바르게 할당할 수 있습니다.
//
//### 결론
//- **생성자**는 객체가 생성될 때 객체를 적절하게 초기화하는 데 필요합니다.
//- **`this` 키워드**는 현재 객체에 대한 참조를 제공하며, 필드와 매개변수의 이름이 같을 때 이를 구별하는 데 사용됩니다.
//
//이러한 메커니즘을 통해 객체의 상태를 초기화하고, 코드의 명확성을 유지할 수 있습니다.

//--------------------------------------------------------------
//class BlackBox {
//    int serialNumber;
//
//    public BlackBox(int serialNumber) {
//        this.serialNumber = serialNumber;
//    }
//}


//this.serialNumber는 "현재 객체의 serialNumber 필드"를 가리키며,
//serialNumber (매개변수)는 생성자에 전달된 값을 가리킵니다.

//------완벽한 예제-------------------------------------------------

//class BlackBox {
//    int serialNumber;
//
//    public BlackBox(int serialNumber) {
//        this.serialNumber = serialNumber;
//    }
//}
//
//public class TestBlackBox {
//    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox(101); // 첫 번째 객체 생성, 시리얼 번호 101 할당
//        BlackBox b2 = new BlackBox(202); // 두 번째 객체 생성, 시리얼 번호 202 할당
//
//        System.out.println(b1.serialNumber); // 101 출력
//        System.out.println(b2.serialNumber); // 202 출력
//    }
//}

