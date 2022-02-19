package demo1;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/congif.properties"));
		Connection conn= Config.getConnect(prop);
		
	   
		
				
			PrintWriter out1 = response.getWriter();
			
			 String user = request.getParameter("ID");
				
				try {
					Statement stmt= conn.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_FORWARD_ONLY);
					ResultSet rs=stmt.executeQuery("select * from eproduct where ID="+user+"");
					
					while(rs.next())
					{
					 out.println(rs.getInt("ID")+"<br>"+rs.getString("name")+"<br>"+rs.getString("price")+"<br>");
					}
						
			         
				} catch (Exception e) {
				
					e.printStackTrace();
				}

		out.print("</table>");
	}
	

	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
