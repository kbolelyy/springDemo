<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2018
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<head>
    <title>Create employee </title>
</head>
<body>

<form:form>
    <h5 class="card-title">Employee Info</h5>
    <div class="card" style="width: 18rem;">
        <ul class="list-group list-group-flush">
            <li class="list-group-item">
                <div class="form-group">
                    <label>Id</label>
                    <div>${employeeEdit.id}</div>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-group">
                    <label>First name</label>
                        ${employeeEdit.firstName}"
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-group">
                    <label>Last name</label>
                        ${employeeEdit.secondName}"
                </div>
            </li>
        </ul>
    </div>
    <a href="${pageContext.request.contextPath}/employeeSort/1/10/id">
        <button type="button" class="btn btn-primary">Back to info Employee</button>
    </a>
</form:form>

</body>
</html>
