package com.exam.zgl.mapper;

import java.util.List;

import com.exam.zgl.bean.Questions;

public interface QuestionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
    //关联查询用户
	List<Questions> selectQuestions();
}