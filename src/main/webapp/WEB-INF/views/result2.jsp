<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>result2.jsp입니다</h2>
<%--model객체에 파라미터 값을 담은거니깐 name.id 요런 .id를 안써줘도된다
    model객체에 리스트나 DTO객체를 담았을때만 뒤에 점을 붘여준다
--%>
    name: ${name}
    mobile: ${mobile}
  <a href="/">index로 이동</a>
</body>
</html>
