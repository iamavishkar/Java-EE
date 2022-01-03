import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Logout")

public class Logout extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//HttpSession Part Here
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			session.invalidate();
			out.print("You have been logged out");
			out.print("<br>");
		}
		response.sendRedirect("index.html");
	}
}