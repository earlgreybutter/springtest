package com.example.springtest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EarlgreyMapper {
    List<Map<String, Object>> getEarlgrey();
}