<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.09.2018
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<head>
    <title>EmployeeSort</title>
</head>
<body>
<form:form>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>First name</th>
            <th>Second name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageEmployee}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.fitrstName}</td>
                <td>${employee.secondName}</td>
            </tr>
        </c:forEach>
        <nav>
            <ul class="pagination justify-content-center">
                <li class="page-item ${page == 0  ? "disabled" : ""}">
                    <a class="page-link" href="${pageContext.request.contextPath}/employeeSort?page=${page - 1}&size=10&field=${field}">Last</a>
                </li>
                <c:forEach begin="${page}" end="${page + 2}" var="p">
                    <li class="page-item ${page == p ? "active" : ""}">
                        <a class="page-link" href="${pageContext.request.contextPath}/employeeSort?page=${p}&size=10&field=${field}">${p}</a>
                    </li>
                </c:forEach>
                <li  class="page-item ${page + 2 > employeeCount/10  ? "disabled" : ""}">
                    <a class="page-link" href="${pageContext.request.contextPath}/employeeSort?page=${page + 1}&size=10&field=${field}">Next</a>
                </li>
            </ul>
        </nav>
        <select id="page" name="page">
            <option value="10" selected="selected">10</option>
            <option value="20">20</option>
            <option value="50">50</option>
        </select>
        <input type="submit" value="Search">
        </tbody>
    </table>
</form:form>

</body>
</html>
