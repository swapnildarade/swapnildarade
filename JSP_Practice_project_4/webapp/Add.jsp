<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*"%>
    <%@page import="java.lang.*" %>


<%


try
{
	
       	Connection con;
		PreparedStatement pst;
	
        PrintWriter out1=response.getWriter();
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce" ,"root","Darade@123");

        
        String ii =request.getParameter("id");
        String na = request.getParameter("Name");
        String pr = request.getParameter("Price");
               
        pst = con.prepareStatement("insert into mobile(ID,name,price) values(?,?,?)");
        pst.setString(1, ii);
        pst.setString(2, na);
        pst.setString(3, pr);
     
        pst.executeUpdate();  
      	 out1.println("<br><br>"+"Entered data as per below");
        out1.println("<br><br>"+"ID :"+ii);
        out1.println("<br><br>"+"Name :"+na);
        out1.println("<br><br>"+"Price :"+pr);
}
catch (Exception e)
{
	out.println(e);
}
%> 
   





