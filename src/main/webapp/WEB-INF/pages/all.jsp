<%@ page import ="com.iamvickyav.MVCSample.model.Student" %>
<%@ page import ="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All student details</title>
    <style>
    table, th, td {
      border: 1px solid black;
    }
    table.center {
      margin-left: auto;
      margin-right: auto;
    }
    </style>
</head>
<body>
   <h2> Student details are as follow </h2>
   <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Gender</th>
        </tr>
        <c:forEach var="student" items="${students}">
        <tr>
        	<td>${student.id}</td>
   			<td>${student.title}. ${student.name}</td>
   			<td>${student.gender}</td>
        </tr>
   		</c:forEach>
   </table>
</body>