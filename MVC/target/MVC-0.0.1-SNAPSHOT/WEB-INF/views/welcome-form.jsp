<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form action="registerProcess" modelAttribute="customer" method="post">
<div align="center">
<h1 align="center">Welcome to Parking site..!</h1>
<hr>
<table style="with: 50%">
 <tr>
                <td>UserName</td>
                <td><input type="text" name="username"/></td>
            </tr>
     <tr>
                <td>First Name</td>
                <td><input type="text" name="first_name"/></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="last_name"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="password" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="emailadd"/></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone"/></td>
            </tr>
            
    </table>  
    <input type="submit" value="register" align='<jsp:element name="center"></jsp:element>'/>      
</div>
</form>
</body>
</html>