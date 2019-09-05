<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>mvc-java</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Welcome to mvc-java</h1>

    <a href="<c:url value="/mvc-java" />">Spittles</a> |
    <a href="<c:url value="/mvc-java/register" />">Register</a>
  </body>
</html>
