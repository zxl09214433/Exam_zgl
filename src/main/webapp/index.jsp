<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>千锋南京JAVA1802机试题</title>
<meta name="description" content="实例演示" />
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<style type="text/css">
.demo{width:760px; margin:60px auto 10px auto}

</style>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script src="js/quiz.js"></script>
<script>
/*  
 * 
 {'questions':[{'question':'jQuery是什么？',
	 'answers':['JavaScript库','CSS库','JAVA框架','以上都不是'],'correctAnswer':1}
 ,{'question':'找出不同类的一项?','answers':['写字台','沙发','电视','桌布'],'correctAnswer':3},{'question':'国土面积最大的国家是：','answers':['美国','中国','俄罗斯','加拿大','法国'],'correctAnswer':3},{'question':'月亮距离地球多远？','answers':['18万公里','38万公里','100万公里','180万公里'],'correctAnswer':2}]};

 
 */
 var init=${str};


 $(function(){
		$('#quiz-container').jquizzy({
	        questions: init.questions
	    });
	});
</script>
</head>

<body>

	<input type="hidden" id="str" name="str" value="${str}"/>
	<div class="demo">
		<div id='quiz-container'>
	
		</div>
	</div>
</body>
</html>
