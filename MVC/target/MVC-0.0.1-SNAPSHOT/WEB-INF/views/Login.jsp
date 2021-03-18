<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Login page</title>
</head>
<body>
<form action="loginProcess" modelAttribute="login" method="post">
<h1 align="left">Login Page</h1>
<table>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="login" /></td>
            </tr>
        </table>

</form>
 <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
</body>
</html>
























<!-- <table align="center">
<tr>
                       
      <td>
        <form:label path="username">Username: </form:label>
      </td>
      <td>
        <form:input path="username" name="username" id="username" />
      </td>
</tr>
<tr>
      <td>
      <form:label path="password">Password:</form:label>
       </td>
      <td>
      <form:password path="password" name="password" id="password" />
      </td>
</tr>
 <tr>
 <td></td>
 <td align="left">
<form:button id="login" name="login" >Login</form:button>
</td>
 </tr>
 

</table>  -->