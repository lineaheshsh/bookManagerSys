<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
DB 테이블 조회 값  
</h1>

<a href="/book/allBookList.do">클릭하면 보여집니다.</a>
<table border="1" margin="10" padding="10">
	<c:forEach items="${contents }" var="content">
	<tr>
		<td>책 번호</td>
		<td>책 이름</td>
		<td>카테고리</td>
		<td>출판사</td>
		<td>저자명</td>
		<td>일시</td>
		<td>이미지경로</td>
		<td>책장번호</td>
		<td>수량</td>
	</tr>
	<tr>
		<td>${content.book_id }</td>
		<td>${content.book_name }</td>
		<td>${content.category }</td>
		<td>${content.publisher }</td>
		<td>${content.author }</td>
		<td>${content.date }</td>
		<td>${content.img_src }</td>
		<td>${content.bookcase }</td>
		<td><fmt:formatNumber value="${content.quantity }" type="number" /></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
