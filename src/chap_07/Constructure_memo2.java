package chap_07;


//public class BlackBox {
//    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
//    static boolean canAutoReport = false; // 자동 신고 기능        *Static -> 클래스 변수
//    String modelName; // 모델명
//    String resolution; // 해상도
//    int price; // 가격
//    String color; // 색상
//    int serialNumber; // 시리얼 번호
//
//    BlackBox() {
////        System.out.println("기본 생성자 호출");
////        this.serialNumber = ++counter;
////        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
//    }
//
//    BlackBox(String modelName, String resolution, int price, String color) {
////        this(); // 기본 생성자 호출
////
////        System.out.println("사용자 정의 생성자 호출");
////        this.modelName = modelName;
////        this.resolution = resolution;
////        this.price = price;
////        this.color = color;
//    }


//이 코드는 `BlackBox` 클래스를 정의하는 과정에서 두 가지 유형의 생성자를 사용하는 예시를 보여줍니다. 생성자는 객체가 생성될 때 자동으로 호출되는 특수한 메소드로, 객체의 초기화를 담당합니다. 여기서는 기본 생성자와 매개변수가 있는 사용자 정의 생성자 두 가지를 살펴보겠습니다.
//
//### 1. 기본 생성자 (`BlackBox()`)
//기본 생성자는 매개변수가 없으며, 객체 생성 시 기본적으로 실행되는 초기화 작업을 수행합니다. 이 생성자에서는 다음 작업을 수행합니다:
//
//- `counter` 값을 증가시켜 각 객체에 고유한 시리얼 번호를 할당합니다. `counter`는 `static` 변수이므로, `BlackBox` 클래스의 모든 인스턴스에서 공유됩니다. 이는 모든 `BlackBox` 객체가 고유한 시리얼 번호를 가지게 하며, 객체가 생성될 때마다 시리얼 번호가 1씩 증가합니다.
//- 생성된 객체의 시리얼 번호를 출력합니다.
//
//### 2. 사용자 정의 생성자 (`BlackBox(String modelName, String resolution, int price, String color)`)
//이 생성자는 `modelName`, `resolution`, `price`, `color`라는 네 개의 매개변수를 받습니다. 이 생성자에서 수행하는 작업은 다음과 같습니다:
//
//- 첫 줄의 `this();`를 통해 기본 생성자를 호출합니다. 이는 매개변수가 있는 생성자가 호출되더라도 기본 생성자에서 정의된 초기화 작업(시리얼 번호 할당 등)이 수행되도록 합니다.
//- 객체의 `modelName`, `resolution`, `price`, `color` 필드에 매개변수로 전달받은 값을 할당합니다.
//
//### 생성자 호출 흐름
//객체 생성 시 두 생성자 중 하나가 호출됩니다. 어떤 생성자가 호출되는지는 객체를 생성할 때 사용된 코드에 따라 달라집니다.
//
//- `BlackBox b1 = new BlackBox();`와 같이 객체를 생성하면 기본 생성자가 호출됩니다.
//- `BlackBox b2 = new BlackBox("까망이", "FHD", 200000, "블랙");`과 같이 객체를 생성하면 사용자 정의 생성자가 호출됩니다. 이 경우, 내부적으로 `this();`를 통해 기본 생성자도 함께 호출되어, 시리얼 번호 할당 등의 초기화 작업이 먼저 수행된 후, 전달받은 값으로 필드를 초기화합니다.
//
//이 흐름을 통해 `BlackBox` 객체는 필요한 초기화 작업을 거쳐 정상적으로 생성됩니다. 기본 생성자는 단순한 초기화를, 사용자 정의 생성자는 보다 구체적인 초기화(필드 값 설정)를 담당합니다.