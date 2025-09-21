<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%@ page isELIgnored="false" %> <!--Enable EL -->
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- use JSTL-->

<html>
  <head>
    <title>Model View</title>
  </head>
  <body>
    <h2>Name: ${name}</h2>

   <c:forEach var="item" items="${fruits}">
   <h1>${item}</h1>
   </c:forEach>
  </body>

</html>
