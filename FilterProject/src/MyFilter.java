import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/MyFilter")

public class MyFilter implements Filter{
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Filter invoke before");
		chain.doFilter(request, response);
		out.print("Filter invoke after");
	}
	
}