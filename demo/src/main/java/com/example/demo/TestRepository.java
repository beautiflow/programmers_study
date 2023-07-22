package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface TestRepository {
    // 저장소(DB)랑 대화해서, 서비스가 원하는 데이터를 주거나/지우거나/수정하거나

   // private Map<String, String> db = new HashMap<>();
    // 자바 (자료구조)컬렉션 중 실무에선 2개만 알면 되어요.
    // list(arraylist), map(hashmap)


    abstract public String save(String val);
    abstract public String search(Long valId);
}
