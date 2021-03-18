<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Welcome</title>
</head>
<body>
<div align = "center">
<h1>Persons List</h1>
<h3>
<a href="newPerson"> New Person</a>
</h3>
<table border = "2">
<tr>
<th>Name</th>
<th>City/Country</th>
<th>Action</th>

<c:forEach var="person" items="${listperson}">
<tr>
<td>${person.name}</td>
<td>${person.country}</td>
<td><a href= "<c:url value='/${person.id}'/>">Edit</a></td>
<td><a href = "<c:url value='/person/delete/${person.id}'/>">Delete</a>
</td>
</tr>

</c:forEach>
</table>
</div>
</body>
</html>
