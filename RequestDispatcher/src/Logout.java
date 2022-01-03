import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Logout")

public class Logout extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//String email = request.getParameter("email");
		//String pass = request.getParameter("pass");
		
		Cookie username=null;
		
		Cookie ck[] = request.getCookies();
		if(ck!=null) {
			for(Cookie ck3:ck) {
				if(ck3.getName().equals("email")) {
					username=ck3;
					break;
				}
			}
		}
		
		if(username!=null) {
			username.setMaxAge(0);
			response.addCookie(username);
		}
		response.sendRedirect("index.html");
		
		
		
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