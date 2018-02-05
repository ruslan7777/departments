<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RUSLAN77
  Date: 05.02.2018
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example</title>
</head>
<body>

<c:set var="totalSize" scope="session" value="40"/>
<c:set var="churSize" scope="session" value="10"/>
<c:set var="start" scope="page" value="1"/>
<c:set var="finish" value="${start+churSize-1}"/>

<c:forEach var="item" varStatus="current"
           begin="${start}" end="${finish}">

    Item: <c:out value="$ {item}"/>
    Current count: <c:out value="$ {current.count}"/>
    Current index: <c:out value="$ {current.index}"/>
    <br>

    <c:if test="${current.index==finish}">
    <c:out value="_____________________"/>
    </c:if>

</c:forEach>


</body>
</html>
