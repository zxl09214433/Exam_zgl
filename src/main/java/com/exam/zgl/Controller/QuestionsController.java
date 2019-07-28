package com.exam.zgl.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.zgl.bean.Questions;
import com.exam.zgl.service.QuestionsService;
@Controller
@RequestMapping("questions")
public class QuestionsController {
	@Resource
	private QuestionsService questionsService;
	@RequestMapping("list")//questions/list
	public String selectQuestions(Model model){
		List<Questions> listQuestions=questionsService.selectQuestions();
		System.out.println(listQuestions);
		/*
		 * {'questions':[{'question':'jQuery是什么？','answers':['JavaScript库','CSS库','JAVA框架','以上都不是'],'correctAnswer':1},
		 * 				{'question':'找出不同类的一项?','answers':['写字台','沙发','电视','桌布'],'correctAnswer':3},
		 * 				{'question':'国土面积最大的国家是：','answers':['美国','中国','俄罗斯','加拿大','法国'],'correctAnswer':3},
		 * 				{'question':'月亮距离地球多远？','answers':['18万公里','38万公里','100万公里','180万公里'],'correctAnswer':2}]};

		 * 
		 * 
		 * */
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
		model.addAttribute("str",buffer.toString());
		return "/index.jsp";
	}
}
