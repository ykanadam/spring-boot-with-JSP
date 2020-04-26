<%@ page import ="com.iamvickyav.MVCSample.Student" %>
<%@ page import ="java.util.List" %>
<html>
<head>
    <title>All student details</title>
</head>
<body>
    <% List student = (List) request.getAttribute("students"); %>
    Size is <h2><%=student.size()%></h2>
</body>