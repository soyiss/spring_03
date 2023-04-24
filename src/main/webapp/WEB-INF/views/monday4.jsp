<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--c:foreach를 쓰려면 이거 가져와야됨 밑에줄!--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-dark table-hover">
    <tr>
        <th>id</th>
        <th>email</th>
        <th>password</th>
        <th>name</th>
        <th>mobile</th>
    </tr>
    <%-- c:forEach는 jsp문법이다        --%>
    <%-- items: 반복할 대상, var: 반복변수  --%>
    <%-- 자바로 표현해 봤을땐.. for(StudentDTO s: studentList)로 표현한다   --%>
    <c:forEach items="${memberList}" var="member">
        <tr>
            <td> ${member.id}</td>
            <td> ${member.email}</td>
            <td> ${member.password}</td>
            <td> ${member.name}</td>
            <td> ${member.mobile}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
