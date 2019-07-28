package com.exam.zgl.bean;

import java.util.List;

import lombok.Data;

@Data
public class Questions {
    private Integer id;

    private String qname;

    private String correctanswer;
    /*问题和答案时一对多的关系*/
    private List<Answers> answers;

}