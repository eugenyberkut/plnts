<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yevge
  Date: 25.10.2016
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stars</title>
</head>
<body>
    <table>
        <c:forEach items="${stars}" var="star">
            <tr><td>${star.id}</td><td>${star.name}</td></tr>
        </c:forEach>
    </table>
</body>
</html>
