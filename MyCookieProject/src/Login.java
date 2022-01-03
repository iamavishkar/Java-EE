import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")

public class Login extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		if( (email.equals("email")) && (pwd.equals("pwd")) ) {
			
			Cookie ck = new Cookie("email", email);
			Cookie ck2 = new Cookie("pwd", pwd);
			
			ck.setMaxAge(1000);
			ck2.setMaxAge(1000);
			
			response.addCookie(ck);
			response.addCookie(ck2);
			
			response.sendRedirect("Home");
			
		}else {
			
			out.println("Incorrect Email and Password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}		
		
	}
}