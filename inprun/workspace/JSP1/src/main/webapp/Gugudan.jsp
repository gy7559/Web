<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>������ ���</h2>
<%
for(int i=1;i<10;i++){
	for(int u=1;u<10;u++){
	%>		
		<%=i %>X<%=u %> = <%= i*u%><br>
	<%}%><br>
<% }

// out.write(i+"*"+u+ "= "+ i*u); ������Ҽ� �ִ�. ������ ��ſ�
%>

</body>
</html>