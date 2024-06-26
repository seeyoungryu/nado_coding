package Basic;

//"생성자가 객체를 초기화한다"는 말은,
// 생성자가 객체가 메모리에 생성될 때 그 객체의 상태를 적절하게 설정하는 역할을 한다는 뜻입니다.
// 객체 초기화는 객체의 필드(속성)에 초기 값들을 할당하거나, 객체 생성 시 필요한 준비 작업을 수행하는 것을 포함합니다.
// 간단히 말해, 객체가 사용될 준비를 하는 과정입니다.

//
//예를 들어, 학생을 나타내는 `Student` 클래스가 있다고 가정해 봅시다.
// 이 클래스에는 `name`과 `age`라는 필드가 있을 수 있습니다.
// 클래스의 생성자를 사용하여 객체를 생성할 때, 이러한 필드에 적절한 초기 값을 설정할 수 있습니다.
//
//-----------------------------------------------------------------------------
//public class Student {
//    String name;
//    int age;
//
//    // Student 클래스의 생성자
//    public Student(String name, int age) {
//        this.name = name; // 이 객체의 name 필드를 매개변수로 받은 name 값으로 초기화
//        this.age = age; // 이 객체의 age 필드를 매개변수로 받은 age 값으로 초기화
//    }
//}
//-----------------------------------------------------------------------------

//이 예제에서 생성자 `Student(String name, int age)`는 객체가 생성될 때 `name`과 `age` 필드에 대한 초기 값을 설정합니다.
// 즉, `Student` 객체의 초기 상태를 설정하는 것입니다. 이렇게 생성자를 통해 객체의 초기 상태를 설정하는 과정을 "객체 초기화"라고 합니다.
//생성자를 사용하는 이유는 객체가 일관된 상태로 시작되도록 보장하기 위해서입니다.
// 객체가 예상대로 작동하기 위해 필요한 모든 필수 정보가 생성 시점에 제공되도록 하는 것이 중요합니다.
// 생성자는 이러한 정보를 받아 객체의 필드를 적절히 설정함으로써, 객체가 안정적으로 작동할 수 있는 초기 상태를 제공합니다.

