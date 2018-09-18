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
    <a href="${pageContext.request.contextPath}/createNewEmployee"><button class="btn btn-primary" type="button">Create employee</button></a>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>First name</th>
            <th>Second name</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageEmployee}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.secondName}</td>
                <td><a href="${pageContext.request.contextPath}/editEmployee/${employee.id}"><button class="btn btn-primary" type="button">Edit</button></a></td>
                <td><a href="${pageContext.request.contextPath}/deleteEmployee/${employee.id}"><button class="btn btn-primary" type="button">Delete</button></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <ul class="nav">
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/employeeSort/${page}/10/${field}">10</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/employeeSort/${page}/25/${field}">25</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/employeeSort/{page}/50/${field}">50</a>
        </li>
    </ul>
    <div>
        <nav>
            <ul class="pagination justify-content-center">
                <li class="page-item ${page == 0  ? "disabled" : ""}">
                    <a class="page-link" href="${pageContext.request.contextPath}/employeeSort/${page - 1}/${size}/${field}">Last</a>
                </li>
                <c:forEach begin="${page}" end="${page + 2}" var="pageNumber">
                    <li class="page-item ${page == pageNumber ? "active" : ""}">
                        <a class="page-link" href="${pageContext.request.contextPath}/employeeSort/${pageNumber}/${size}/${field}">${pageNumber + 1} </a>
                    </li>
                </c:forEach>
                <li  class="page-item ${page + 2 > employeeCount/size ? "disabled" : ""}">
                    <a class="page-link" href="${pageContext.request.contextPath}/employeeSort/${page + 1}/${size}/${field}">Next</a>
                </li>
            </ul>
        </nav>
    </div>

</body>
</html>
