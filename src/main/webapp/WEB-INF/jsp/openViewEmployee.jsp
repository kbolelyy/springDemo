<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2018
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<head>
    <title>Create employee </title>
</head>
<body>

<form:form  method="post" modelAttribute="employee" action="/addEmployee">
    <div class="form-group">
        <label>First name</label>
        <input type="text" class="form-control" placeholder="First name" value="">
    </div>
    <div class="form-group">
        <label>Last name</label>
        <input type="text" class="form-control" placeholder="Last name">
    </div>
    <button type="submit" value="Create" class="btn btn-primary">Create</button>
</form:form>

</body>
</html>
