<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yevge
  Date: 12.11.2016
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Планеты</title>
    <link href="styles.css" type="text/css" rel="stylesheet">
</head>
<body>
    <h1>Звезда: ${star.name}</h1>
    <table>
        <thead>
        <tr><th>название</th><th>радиус</th><th>атм</th></tr>
        </thead>
        <tbody>
            <c:forEach items="${planets}" var="planet">
                <tr>
                    <td>${planet.name}</td><td>${planet.radius}</td><td>${planet.atm}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
