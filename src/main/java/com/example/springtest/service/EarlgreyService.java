package com.example.springtest.service;

import java.util.List;
import java.util.Map;

public interface EarlgreyService {
    List<Map<String, Object>> getEarlgrey() throws Exception;
}