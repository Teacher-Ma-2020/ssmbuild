<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/insertBook" >
    书籍名称：<input type="text" name="bookName" required/><br/>
    书籍数量：<input type="text" name="bookCounts" required/><br/>
    描述：<input type="text" name="detail" required/><br/>
    <input type="submit" value="添加"/>
</form>

</body>
</html>
