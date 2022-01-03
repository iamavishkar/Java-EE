import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")

public class Login extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html"); //Setting Content Type
		PrintWriter out = response.getWriter(); //Creating Reference variable for PrintWriter
		
		//ArrayList Code Here
		/* ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("ramesh"); */
		
		//ServletContext Code Here
		//ServletContext ctx = getServletContext();
		//ctx.setAttribute("name", list); //Setting Attribute Value
		
		//HttpSession Code Here
		//HttpSession session = request.getSession();
		//session.setAttribute("name", list);
		
		//Getting Parameter
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		//Checking Email and Password
		if( (email.equals("demo") ) && (pass.equals("pass")) ) {
			//RequestDispatcher rd = request.getRequestDispatcher("Success");
			//rd.forward(request, response);
			
			//Cookie Code
			Cookie ck = new Cookie("email", email);
			//Cookie ck2 = new Cookie("pass", pass);
			//ck.setMaxAge(60);
			//ck2.setMaxAge(0);
			response.addCookie(ck);
			//response.addCookie(ck2);
			
			response.sendRedirect("Success");
		}else {
			out.println("Incorrect email and password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
	}
}