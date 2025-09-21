<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%@ page isELIgnored="false" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Model View</title>
  </head>
  <body>
    <h1>Hello ModelAndView</h1>

    <h2>Name: ${name}</h2>

   <c:foreach var="fruit" items="${fruits}">
   <h1>${fruit}</h1>
   </c:foreach>
   

  </body>
</html>
