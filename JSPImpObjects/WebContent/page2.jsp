<html>
<body>

<%
String username = (String)session.getAttribute("username");
out.print("Again hello, "+username);
out.print("This was the last page");
%>

</body>
</html>