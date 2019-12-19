package com.project.elevator.api.service;

import com.project.elevator.api.repository.mapper.CaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class CaseService {
    @Autowired
    private CaseMapper caseMapper;

    public String getJsonById(int id){
        String json = caseMapper.getJsonById(id);
        return json;
    }
}
