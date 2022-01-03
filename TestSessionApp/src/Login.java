import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")

public class Login extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Getting Parameter values
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Condition Checking Part Here
		if(username.equals("aman") && password.equals("1234")) {
			
			//HttpSession Code Here
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("Home");
		}else {
			out.print("Invalid Username and password");
			out.print("<br>");
			response.sendRedirect("index.html");
		}
	}
}