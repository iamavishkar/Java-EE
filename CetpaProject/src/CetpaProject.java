import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CetpaProject extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try{
			//load Driver
			Class.forName("com.mysql.jdbc.Driver");
			//create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
			//create statement
			Statement stmt=con.createStatement();
			//sql

			String sql="insert into students(name,email,mobile)values('aman','aman@gmail.com',5555)";

			//run sql
			  
			  int i=stmt.executeUpdate(sql);
			if(i>0){

			System.out.println("inserted");
			}
			}


			catch(Exception e){
			e.printStackTrace();
			}
	}
}