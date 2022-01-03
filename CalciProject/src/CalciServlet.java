import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalciServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
        out.println("<head>");
        out.println("<title>CalciServlet Result!</title>");
        out.println("<link rel='stylesheet' href='style.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>CalciServlet Result!</h1>");
		
		String num1 = req.getParameter("num1");
		String num2=req.getParameter("num2");
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		out.print("First number = "+n1);
		out.print("<br>");
		out.print("Second number = "+n2);
		out.print("<br>");
		String n = req.getParameter("calc");
			if(n.equals("Add")) {
				int re1=n1+n2;
				out.print("Addition is = "+re1);
			}
			if(n.equals("Substract")) {
				int re2=n1-n2;
				out.print("Substraction is = "+re2);
			}
			if(n.equals("Multiply")) {
				int re3=n1*n2;
				out.print("Multiplication is = "+re3);
			}
			if(n.equals("Division")) {
				int re4=n1/n2;
				out.print("Division is = "+re4);
			}
			
			out.println("</body>");
	        out.println("</html>");
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		doPost(req, res);
	}
}