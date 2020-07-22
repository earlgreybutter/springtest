package com.example.springtest.service;

import java.util.List;
import java.util.Map;

import com.example.springtest.mapper.EarlgreyMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EarlgreyServiceImpl implements EarlgreyService {
    
    private EarlgreyMapper earlgreyMapper;

    
    @Autowired
    EarlgreyServiceImpl(EarlgreyMapper earlgreyMapper){
        this.earlgreyMapper = earlgreyMapper;
    }

    public List<Map<String, Object>> getEarlgrey(){
        return earlgreyMapper.getEarlgrey();
    }
}