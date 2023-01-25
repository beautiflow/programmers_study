package week3;

public class Person {

    Phone samsong;  // 변수는 선언하는 위치 기준 자신을 감싸는 중괄호 안에서만 활동한다.

    void buyPhone(Phone phone){  // 폰을 사는 메소드
        // samsong = new Phone("삼송");
         samsong = phone;

    }

    void say(){  // 폰 샀다고 자랑하는 메소드
        System.out.println(samsong.getBrand() + "폰 샀다!");
    }

}
