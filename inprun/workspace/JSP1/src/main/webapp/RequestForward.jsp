<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//������� ������ ����Ǿ��ִ� ��ü = request�� getParameter�޼ҵ带 �̿��ؼ� ������� ������ ���� ����
	String id = request.getParameter("id");	//������� id���� �о� ����� ���� id�� �����Ͻÿ�
	String pass = request.getParameter("pass");
%>

	<h2>
	RequstForward ������ �Դϴ�.<br>
	����� ���̵��<%= id %> �̰� �н������ <%= pass %> �Դϴ�.</h2>
	
</body>
</html>