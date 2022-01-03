import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Home")

public class Home extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			if(session.getAttribute("username").equals("aman")) {
				String user = (String)session.getAttribute("username");
				out.print("Hello, "+user);
				out.print("<br>");
				out.print("<a href='Logout'>Logout</a>");
			}
		}else {
			response.sendRedirect("index.html");
		}
		
	}
}