<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍展示页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/queryBook">
    查询名称：<input type="text" name="queryName">
    <input type="submit" value="查询">
</form>
<table border="1">
    <tr>
        <td><c:out value="书籍id"/></td>
        <td><c:out value="书籍名称"/></td>
        <td><c:out value="剩余数量"/></td>
        <td><c:out value="详情"/></td>
        <td><a href="${pageContext.request.contextPath}/book/addBook">添加</a></td>
    </tr>
    <c:forEach items="${list}" var="i">
        <tr>
            <td><c:out value="${i.bookID}"/></td>
            <td><c:out value="${i.bookName}"/></td>
            <td><c:out value="${i.bookCounts}"/></td>
            <td><c:out value="${i.detail}"/></td>
            <td>
                <a href="${pageContext.request.contextPath}/book/toUpdate/${i.bookID}">修改</a>
                |
                <a href="${pageContext.request.contextPath}/book/delete/${i.bookID}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
