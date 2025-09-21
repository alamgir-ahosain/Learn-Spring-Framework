<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Home Page 2 </title>
</head>
<body>
<h1>ModelAndView Page</h1>

<%
    String name = (String) request.getAttribute("name");
    List<String> fruits = (List<String>) request.getAttribute("fruits");
%>

<h1><%= (name != null) ? name : "Name not found" %></h1>
<h1>
<%
    if (fruits != null) {
        for (String fruit : fruits) {
            out.println(fruit + "<br/>");
        }
    } else {
        out.println("No Fruits found");
    }
%>
</h1>

</body>
</html>
