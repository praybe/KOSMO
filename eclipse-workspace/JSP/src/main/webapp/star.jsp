<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>별찍기</h1>

<%
for(int i =1; i<=5; i++){
	for(int j =0; j<i; j++){ 
		out.print("*");
	}
	out.print("<br>");

} 
%>
<!-- 위에거가 좀 더 완벽한 정답. 아래는 공간이 띄어짐 -->
<%out.print("<br>"); %>


<%
for(int i =1; i<=5; i++){
	for(int j =0; j<i; j++){ %>
		<%= "*" %>
	<%}%>
	<%= "<br>" %>

<%} %>

</body>
</html>