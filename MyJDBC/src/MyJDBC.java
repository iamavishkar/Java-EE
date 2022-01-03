import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("MyJDBC")

public class MyJDBC extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); //register driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root",""); //set connection
			Statement stmt = con.createStatement(); //create statement
			String sql = "insert into students(name, email, mobile)values('"+name+"', '"+email+"', "+mobile+")";
			int i = stmt.executeUpdate(sql);
			if(i>0) {
				out.print("Record inserted successfully");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}