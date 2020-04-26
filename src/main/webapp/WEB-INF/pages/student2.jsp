<%@ page import ="com.iamvickyav.MVCSample.Student" %>
<html>
<head>
    <title>Student Detail Page</title>
</head>
<body>
    <% Student student = (Student) request.getAttribute("student"); %>
    <h2>Thank you for visiting Student Detail Page </h2>
    <br>
    <h3>You are viewing details of the following student </h3>
    <h3><%=student.name%></h3>
    <br>
    <h3><%=student.gender%></h3>
    <br>
    <h3><%=student.title%></h3>
</body>
</html>