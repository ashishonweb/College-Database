<%@page import="PoJo.Student"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <% List<Student> students=(List<Student>)request.getAttribute("students"); %>
    <body>
        <table border="1" width="500">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Gender</td>
        <td>E-Mail</td>
        <td>Phone Number</td>
        <td>Stream</td>
        <td>Command</td>
    </tr>
    
    <% for(Student student:students){ %>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getName() %></td>
        <td><%= student.getGender() %></td>
        <td><%= student.getEmail() %></td>
        <td><%= student.getPhone() %></td>
        <td><%= student.getStream() %></td>
        <td><a href="detail.htm?id=<%= student.getId() %>">Details</a></td>
        
    </tr>
    <% } %>
        </table><br><br>    
        
        <form action="addDetail.htm">
            <input type="submit" Value="Add Details">
        </form>
        
    </body>
</html>
