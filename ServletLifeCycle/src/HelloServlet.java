import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet implements Servlet{
	
	int i;
	ServletConfig config=null;
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		i=1;
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Hello World!");
		i++;
		out.println(i);
		String name = config.getInitParameter("name");
		out.println("Name = "+name);
		out.print("<br>");
		ServletContext ctx = config.getServletContext();
		String driver=ctx.getInitParameter("driver");
		out.print("Driver = "+driver);
		
	}
	
}