<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>monday1.jsp입니다</h2>
<%--    <a href="/bbbbb" onclick="fun1()">파라미터 전송</a>--%>
    <button onclick="fun1()">파라미터 전송</button>
</body>
<script>
    const fun1 = () => {
        const month = "4월";
        const day = "24일";
        location.href = "/monday1-param?month="+month+"&day="+day;
    }
</script>
</html>
