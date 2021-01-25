<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form action="registration">
<div align="center">
<h1 align="center">Welcome to Parking site..!</h1>
<hr>
<table style="with: 50%">
     <tr>
                <td>First Name</td>
                <td><input type="text" name="FirstName"/></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="LastName"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="password" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td><input type="text" name="Phone"/></td>
            </tr>
            
    </table>  
    <input type="submit" value="sign-up" align='<jsp:element name="center"></jsp:element>'/>      
<!-- <input type="text" name="fname" value="Fisrt Name" onclick="this.value=''"/><br/>  
<input type="text" name="lname" value="Last Name" onclick="this.value=''"/><br/>  
<input type="text" name="uemail"  value="Email" onclick="this.value=''"/><br/>  
<input type="password" name="upass"  value="Password..." onclick="this.value=''"/><br/>
<input type="text" name="phone"  value="Phone Number" onclick="this.value=''"/><br/>    
<input type="submit" value="register"/> --> 
</div>
</form>
</body>
</html>