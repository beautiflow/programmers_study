package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//  URL : 기본 --> localhost

@RestController // 데이터 던지기
public class TestController {

    @Autowired // TestService ts = new TestService();
    TestService ts;

    // localhost/test
    @RequestMapping(value = "/test", method = RequestMethod.GET)  // localhost/test 라고 요청이 오면 바로 밑 메소드 실행\
    public String test(){ // 기능
        return ts.test();
    }


    @RequestMapping("/apple")
    public String apple(){
        return "apple";
    }

}
