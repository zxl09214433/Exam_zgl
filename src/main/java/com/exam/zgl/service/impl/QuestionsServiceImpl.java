package com.exam.zgl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.exam.zgl.bean.Questions;
import com.exam.zgl.mapper.QuestionsMapper;
import com.exam.zgl.service.QuestionsService;

@Service
public class QuestionsServiceImpl implements QuestionsService {
	@Resource
	private QuestionsMapper questionsMapper;
	@Override
	public List<Questions> selectQuestions() {
		
		return questionsMapper.selectQuestions();
	}

}
