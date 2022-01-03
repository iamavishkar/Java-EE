<%
out.print("Today is: "+java.util.Calendar.getInstance().getTime());
out.print("<br>");
out.print("Driver is = "+request.getParameter("driver"));
%>