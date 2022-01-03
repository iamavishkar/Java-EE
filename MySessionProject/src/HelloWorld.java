import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/HelloWorld")

public class HelloWorld extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		
		//Creating Session
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(05);
		out.println("SessionObject= "+session);
		out.print("<br>");
		out.print("SessionID = "+session.getId());
		out.print("<br>");
		out.print("SessionTime = "+session.getMaxInactiveInterval());
		out.print("<br>");
		out.print("IsNew = "+session.isNew());
		out.print("<br>");
		
		Cookie ck[] = request.getCookies();
		
		if(ck!=null) {
			for(Cookie c:ck) {
				out.print(c.getName()+ " = "+c.getValue());
			}
		}
		
		session.invalidate();
		
	}
}