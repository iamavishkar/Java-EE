<html>
<head>
<title>Project JSP!</title>
</head>
<body>

<h1>
<%
out.print("Scriptlet Tag");
%>
</h1>
<br>
<h1>
<%=
"Expression Tag"
%>
</h1>
<br>
<h1>Declaration Tag<br>
<%!
int num=0;
%>
<%
out.print("Value is = "+num);
%>
<%=
"Value is = "+num
%>
</h1>

</body>
</html>