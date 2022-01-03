import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Success")

public class Success extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//String email = request.getParameter("email");
		//String pass = request.getParameter("pass");
		
		String username=null;
		
		Cookie ck[] = request.getCookies();
		if(ck!=null) {
			for(Cookie ck3:ck) {
				if(ck3.getName().equals("email")) {
					username=ck3.getValue();
					break;
				}
			}
		}
		
		if(username==null) {
			response.sendRedirect("index.html");
		}else {
			out.print("Hello, "+username);
			out.print("<br>");
			out.print("<a href='Logout'>Logout</a>");
		}
		
		
		
		//ServletContext ctx=getServletContext();
		//request.removeAttribute("name");
				
		//HttpSession session = request.getSession();
		//session.getAttribute("name");
		
		/*ArrayList<String> name = (ArrayList<String>)session.getAttribute("name");
		if(name!=null) {
			for(String n:name) {
				out.print("Name = "+n);
			}
		}
		*/
		
		
	}
}