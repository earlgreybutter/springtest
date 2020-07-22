package com.example.springtest.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.example.springtest.dto.NewsDto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
// @Controller + @ResponseBody 
// @Controller - api와 view를 동시에 사용하는 경우 사용 
//                 api 사용시, @ResponseBody 사용하여 객체 반환 
// @ResponseBody - 메소드 반환 결과(문자열)을 JSON 형태로 반환 
@RequestMapping("news")
// class level mapping - /news 로 들어오는 모든 요청에 대한 처리를 해당 클래스에서 함 
public class NewsController {
    @RequestMapping(value="path", method=RequestMethod.GET)
    // handler level mapping - /news/path get방식 요청에 대한 처리를 해당 메소드에서 함 
    // value - 해당 url로 요청 들어오면 수행됨
    public String requestPath() {
        return "String";
    }
    
    @RequestMapping(value="list", method=RequestMethod.GET)
    public List<NewsDto> requestList() {

        List<NewsDto> list = new ArrayList<NewsDto>();

        for(int i=0; i<10; i++){
            NewsDto newsDto = new NewsDto();
            newsDto.setNewsId(i);
            newsDto.setNewsTitle("newsTitle"+i);
            newsDto.setNewsContent("newsContent"+i);
            newsDto.setNewsDate(new Date());

            list.add(newsDto);

        }
        return list;
    }

    @RequestMapping(value="detail/{seq}", method=RequestMethod.GET)
    public NewsDto detail(@PathVariable("seq") int seq){
        NewsDto newsDto = new NewsDto();
        newsDto.setNewsId(seq);
        newsDto.setNewsTitle("newsTitle");
        newsDto.setNewsContent("newsContent");
        newsDto.setNewsDate(new Date());
        return newsDto;
    }
    
}