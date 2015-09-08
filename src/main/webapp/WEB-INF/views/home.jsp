<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Daily Report</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Welcome to Daily Report</h1>

    <a href="<c:url value="/report" />">Report</a> |
    <a href="<c:url value="/register" />">Register</a>
  </body>
</html>
