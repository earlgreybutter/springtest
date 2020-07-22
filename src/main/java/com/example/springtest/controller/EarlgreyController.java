package com.example.springtest.controller;

import java.util.List;
import java.util.Map;

import com.example.springtest.service.EarlgreyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EarlgreyController {
    

    private EarlgreyService earlgreyService;

    
    @Autowired
    EarlgreyController(EarlgreyService earlgreyService){
        this.earlgreyService = earlgreyService;
    }
    

    @GetMapping("/earlgrey")
    @ResponseBody
    public List<Map<String, Object>> getEarlgrey() throws Exception {
        return earlgreyService.getEarlgrey();
    }
    

}