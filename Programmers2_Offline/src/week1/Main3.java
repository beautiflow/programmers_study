package week1;

class Car {  // 자동차 객체를 만들 수 있게 설명해둔, 완성되었을 때 기능을 말해주는 설계도
    // 1. 필드
    // 2. 메소드 : 객체가 가져야하는 행동, 기능 ...

    int wheel = 4;

    void ride(){ // 자동차가 객체가 되면 이 기능을 가지는 것이다.
        System.out.println("씽씽씽");
    }
}

public class Main3{
    public static void main(String[] args) {

        Car car = new Car(); // 자동차 객체를 생성
        car.ride();
    }
}

