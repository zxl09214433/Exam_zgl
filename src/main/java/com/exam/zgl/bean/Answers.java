package com.exam.zgl.bean;

import lombok.Data;

@Data
public class Answers {
	/*答案表的主键*/
    private Integer id;
    /*答案内容*/
    private String aname;
    /*问题表的外键id*/
    private Integer qid;
}