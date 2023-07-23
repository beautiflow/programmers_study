package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    // 서비스가 레파지토리 받는 방법


    public String test(){
        // 분명 .. 서비스가.. 로직짜는 친구라고 했는데
        // return "test" 를 repository 가 대신 해주면
        // 결론은 서비스는 지금 이 로직상 repository 에게 일을 시켜서 받기만 하면 되는 거

        // 컨트롤러로 리턴하는 방법
        return test();
    }


    @Autowired
    TestRepository tr;

    public String save(String val) {
        return tr.save(val);
    }

    public String search(Long valId) {
        return tr.search(valId);
    }

}
