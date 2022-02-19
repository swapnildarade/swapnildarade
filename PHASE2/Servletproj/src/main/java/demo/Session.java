package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String token=request.getParameter("username");
	
		String token2=request.getParameter("password");
		
		if(token.equals("swapnil") && token2.equals("12345")) 
		{
			
			  RequestDispatcher rd=request.getRequestDispatcher("Dashboard");  
		        rd.forward(request,response);  
		}
		else
		{
			
	               out.print("Sorry username or password error");  
	               out.print("<a href='index.html'>&nbsp;&nbsp;&nbsp;&nbsp;reLogin</a>");
	   		    {
	   		    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	               
	   		    }      
	          }  
		}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
