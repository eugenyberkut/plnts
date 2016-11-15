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
    <link href="styles.css" type="text/css" rel="stylesheet">
</head>
<body>
    <form action="addstar.html" method="post">
    <table>
        <thead>
        <tr><th>id</th><th>Название</th><th>Планеты</th></tr>
        </thead>
        <tbody>
        <c:forEach items="${stars}" var="star">
            <tr><td>${star.id}</td><td>${star.name}</td><td><a href="planets.html?sid=${star.id}">показать</a></td></tr>
        </c:forEach>
        <tr><td>new:</td><td><input type="text" name="starname"></td><td><input type="submit" value="Add"></td></tr>
        </tbody>
    </table>
    </form>
</body>
</html>
