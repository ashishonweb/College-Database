<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Details</title>
    </head>
    <body>  
           <form:form modelAttribute="student">
              <form:input type="hidden" path="id" placeholder="Id" /><br>
              <form:input type="text" path="name" placeholder="Name"/>
              <form:errors path="name"/><br>
              <form:input type="text" path="gender" placeholder="Gender(M/F)"/>
              <form:errors path="gender"/><br>
              <form:input type="text" path="email" placeholder="E-Mail"/>
              <form:errors path="email"/><br>
              <form:input type="text" path="phone" placeholder="Phone Number"/>
              <form:errors path="phone"/><br>
              <form:input type="text" path="stream" placeholder="Stream"/>
              <form:errors path="stream"/><br><br>
              <input type="submit" value="Add"><br><br>
       </form:form>
              
               <form action="displayDetail.htm">
            <input type="submit" Value="Display Details">
        </form>
       
    </body>
</html>
