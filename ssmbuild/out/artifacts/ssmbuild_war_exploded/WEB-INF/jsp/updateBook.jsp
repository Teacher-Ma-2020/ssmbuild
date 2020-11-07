
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/book/Update/${book.bookID}" >
        书籍名称：<input type="text" name="bookName" value="${book.bookName}" required/><br/>
        书籍数量：<input type="text" name="bookCounts" value="${book.bookCounts}" required/><br/>
        描述：<input type="text" name="detail" value="${book.detail}" required/><br/>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
