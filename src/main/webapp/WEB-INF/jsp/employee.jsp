<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>EmployeeList</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>First name</th>
        <th>Second name</th>
    </tr>
    <c:forEach items="${employeeList}" var="employee" >
        <tr>
            <td>${employee.id}</td>
            <td>${employee.fitrstName}</td>
            <td>${employee.secondName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
