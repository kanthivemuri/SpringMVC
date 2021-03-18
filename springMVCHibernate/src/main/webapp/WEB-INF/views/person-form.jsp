<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit person</title>
</head>
<body>
    <div align="center">
        <h2>Add/Edit person</h2>
        <form:form action="savePerson" method="post" modelAttribute="person">
            <table border="0" cellpadding="5">
                <!--<tr>
                    <td>id: </td> </tr> -->
                    <form:hidden path="id"/>
                    
                 <!-- <td>${person.id} </td> -->   
                      
                <tr>
                    <td>Name: </td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>City/Country: </td>
                    <td><form:input path="country" /></td>
                </tr>   
                <tr>
                   <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>