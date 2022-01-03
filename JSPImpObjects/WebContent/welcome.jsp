<html>
<body>

<%
String username = request.getParameter("username");
out.print("Hello, "+username);
session.setAttribute("username", username);
%>
<br>
<a href="page2.jsp">Go to Second Page</a>

</body>
</html>