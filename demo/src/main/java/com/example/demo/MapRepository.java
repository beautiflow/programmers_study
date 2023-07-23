package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MapRepository {

    Map<Long, String> db = new HashMap<Long, String>();
    Long id = 1L;

    public String save(String val) {
        db.put(id++, val);
        return val;
    }

    public String search(Long valId) {
        return db.get(valId);
    }
}


