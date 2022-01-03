import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		out.println("Hello World!");
		
		//ServletConfig code
		ServletConfig cfg = getServletConfig();
		String name = cfg.getInitParameter("name");
		out.println("Name = "+name);
		out.print("<br>");
		
		ServletConfig cfg2 = getServletConfig();
		String name2 = cfg2.getInitParameter("name2");
		out.println("Name = "+name2);
		out.print("<br>");
		
		//ServletContext code
		ServletContext ctx = getServletContext();
		String driver=ctx.getInitParameter("driver");
		out.print("Driver = "+driver);
		out.print("<br>");
		
		ServletContext ctx2 = getServletContext();
		String driver2=ctx2.getInitParameter("driver2");
		out.print("Driver = "+driver2);
		
	}
	
}