package com.example.springtest.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsDto {
    private int newsId;
    private String newsTitle;
    private String newsContent;
    private Date newsDate;
}