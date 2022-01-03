import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Home")

public class Home extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//HttpSession Part Here
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			if(session.getAttribute("username").equals("aman")) {
				String username = (String)session.getAttribute("username");
				out.print("Hello, "+username);
				out.print("<br>");
				out.print("<a href='Logout'>Logout</a>");
			}
		}else {
			out.print("You must login first");
			response.sendRedirect("index.html");
		}
	}
}