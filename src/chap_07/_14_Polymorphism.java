package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 : 객체가 여러 형태를 가질 수 있는 속성을 의미함


        //Camera 클래스로 다른 형태의 객체를 만들 수 있다
        // = 상위 클래스 타입의 참조 변수로 하위 클래스의 인스턴스를 참조할 수 있음
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------");

        Camera[] cameras = new Camera[3]; //크기3인 배열 생성 - Camera 타입의 배열
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();
//이 모든 인스턴스는 Camera 타입으로 선언되었기 때문에 'Camera'타입의 배열에 저장할 수 있습니다?


        //for-each 루프를 통한 배열 탐색*

        //<for-each 문의 구조>
        //for (타입* 변수명 : 배열) {
        // 변수명을 사용한 작업
        //}

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }
        // 1. cameras 배열에 저장된 모든 객체를 순회함
        // 2. 각 객체의 showMainFeature() 메소드를 호출함


        System.out.println("----------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {         //instanceof를 사용해 객체가 특정 클래스의 인스턴스인지 확인
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();      //명시적으로 형변환을 수행
        }
        //FactoryCam *클래스 로 형변환해서 FactoryCam 의 detectFirE() 메소드 사용 가능하게 함


        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }


        //모든 자바 클래스는 Object 클래스를 상속받는다!
        // > 이론적으로 어떤 객체도 Object 타입의 배열에 저장할 수 있다

//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}


//for-each 문 추가
//Camera[] cameras : Camera 타입의 객체들을 저장할 수 있는 배열
//        for (Camera cam : cameras) : cameras 배열에 저장된 모든 Camera 객체를 순회함
//        > 배열의 각 요소가 cam 변수에 할당됨



