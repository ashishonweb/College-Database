
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <body>
        <h2>Edit Details</h2>
          <form:form modelAttribute="students">
                 <form:input type="hidden" path="id" />
              <form:input type="text" path="name" />
              <form:input type="text" path="gender"/>
             <form:input type="text" path="email"/>
             <form:input type="text" path="phone"/>
             <form:input type="text" path="stream"/><br><br>
             <input type="submit" value="Update" name="command">
             <input type="submit" value="Delete" name="command">
        </form:form>
    </body>
</html>
