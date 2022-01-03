import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Home")

public class Home extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user=null;
		
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
		if(session.getAttribute("email")!=null) {
			user=(String)session.getAttribute("email");
		}
		}
		else {
			response.sendRedirect("index.html");
		}
			
			out.println("Hello, "+user);
			out.println("<br>");
			out.print("<a href='Logout'>Logout</a>");
			
		}
		
	}
