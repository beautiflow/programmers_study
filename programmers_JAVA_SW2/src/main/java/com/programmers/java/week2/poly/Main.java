package com.programmers.java.week2.poly;

public class Main {
    public static void main(String[] args) {
        UserService s = new UserService(new NaverLogin());
        s.login();

    }
//        // 설정파일, config
//        new Main().run(LoginType.Naver);   // 호스트 코드
//
//    }
//        void run(LoginType loginType) {
//            //로그인을 하고싶다.
//            Login user = getLogin(loginType);
//            user.login();
//        }
//
//       // 팩토리 패턴
//        private Login getLogin (LoginType type){
//            if (type == LoginType.Kakao) return new KakaoLogin();
//            return new NaverLogin();
//        }


}
