<%--
  Created by IntelliJ IDEA.
  User: RUSLAN77
  Date: 29.01.2018
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="guru" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Departments</title>
</head>
<body>
<form action="/addEditDepartment?departmentId=${departmentId}" method="post" >
    <input type="text" name="departmentName" value=${editedName}> Name </input >
    <input type="submit" value="Save" />

</form>

</body>
</html>
