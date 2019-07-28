package com.exam.zgl.Test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exam.zgl.bean.Questions;
import com.exam.zgl.mapper.QuestionsMapper;
import com.exam.zgl.service.QuestionsService;

import net.sf.json.JSONArray;

public class TestDemo {
	
	
	
	@SuppressWarnings("resource")
	@Test
	public void test1() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring_core.xml");
		String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		
		//查询问题表所有信息
		
		QuestionsService service = context.getBean(QuestionsService.class);
		List<Questions> listQuestions = service.selectQuestions();
		System.out.println(listQuestions);
		StringBuffer buffer = new StringBuffer();
		buffer.append("{'questions':[");
		for(int i=0 ;i<listQuestions.size();i++) {
			String str=null;
			if(i!=(listQuestions.size()-1)) {
				 str="{'question':'";
					str+=listQuestions.get(i).getQname();
					str+="','answers':[";
					for(int j=0;j<listQuestions.get(i).getAnswers().size();j++) {
						if(j!=(listQuestions.get(i).getAnswers().size()-1)) {
						str+="'";
						str+=listQuestions.get(i).getAnswers().get(j).getAname()+"',";	
						}else {
							str+="'";
							str+=listQuestions.get(i).getAnswers().get(j).getAname();
							str+="'";
						}
					}
					str+="],'correctAnswer':"
					+listQuestions.get(i).getCorrectanswer()+"},";
			}else {
				 str="{'question':'";
					str+=listQuestions.get(i).getQname();
					str+="','answers':[";
					for(int j=0;j<listQuestions.get(i).getAnswers().size();j++) {
						if(j!=(listQuestions.get(i).getAnswers().size()-1)) {
						str+="'";
						str+=listQuestions.get(i).getAnswers().get(j).getAname()+"',";	
						}else {
							str+="'";
							str+=listQuestions.get(i).getAnswers().get(j).getAname();
							str+="'";
						}
					}
					str+="],'correctAnswer':"
					+listQuestions.get(i).getCorrectanswer()+"}";
			}
			buffer.append(str);
		
			
		}
		buffer.append("]}");
		System.out.println(buffer.toString());
	}

}
