package com.project.elevator.api.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.project.elevator.api.repository.mapper.CaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserkeyService {
    @Autowired
    private CaseMapper userkeyMapper;

    public String generateUserkey(String userid) {

        SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String now = datetimeFormatter.format(new Date());

        String userkey = userid.concat("_").concat(now);

        return userkey;
    };

    public String getJsonById(int id){
        String json = userkeyMapper.getJsonById(id);
        return json;
    }
}
