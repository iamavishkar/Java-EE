import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
        
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String country = request.getParameter("country");
        String gender = request.getParameter("gender");
        String citizen[] = request.getParameterValues("citizen");
        
        out.print("Email is: "+email);
        out.print("<br>");
        out.print("Password is: "+pwd);
        out.print("<br>");
        out.print("Country is: "+country);
        out.print("<br>");
        out.print("Gender is: "+gender);
        out.print("<br>");
        out.print("Citizenship is: ");
        for(int i=0; i<citizen.length; i++) {
        out.print(citizen[i]);
        out.print(" ");
        }
        
    }
}