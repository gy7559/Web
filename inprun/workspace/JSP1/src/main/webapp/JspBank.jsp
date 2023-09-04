<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!	 //!맴버메소드로 지정
	public void inCrement(){
		
	}
%>
<%!	 //!맴버변수로 지정   <%! 는 선언문 
	int a =10;
%>
<%
	int a =100;//지역변수
%> 
<%
	// int a = 1000;//지역변수(충돌남)
%>
</body>
</html>