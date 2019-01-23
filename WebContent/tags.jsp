<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>제목입니다.</h1>
	<h2>제목입니다.</h2>
	<h3>제목입니다.</h3>
	<h4>제목입니다.</h4>
	<h5>제목입니다.</h5>
	<h6>제목입니다.</h6>
	<p>
		가&nbsp;나다라마바사아차카타파하<br> abcdefghijklmnopqrstuvwxyz
	</p>
	<!-- 절대 경로 , 상대 경로 -->
	<!-- 절대 경로 -->
	<a href="/helloweb/hello.jsp">여기를 누르세요(절대경로)</a>
	<br>
	<!-- 상대 경로  '/'가 끝난 지점을 기준으로 a 태그-->
	<a href="hello.jsp">여기를 누르세요(상대경로)</a>
	<br>
	<a href="sub/hello.jsp">여기를 누르세요(상대경로)</a>
	<br>
	<a href="sub/hello.jsp" target='_blanck'>여기를누르세요</a>
	<br>
	<img src="./images/logo.jpg" style="width: 100px">
</body>
</html>