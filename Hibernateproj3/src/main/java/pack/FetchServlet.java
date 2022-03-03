package pack;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

@WebServlet("/fetch")

public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		//String ii=request.getParameter("ID");
		String na=request.getParameter("name");
		String pr=request.getParameter("price");
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();	
		
		
		Transaction tx= session.beginTransaction();
		
		mobile cust= new mobile();
		
//		cust.setID(ii);
		cust.setName(na);
		cust.setPrice(pr);
		session.save(cust);
		try {
			tx.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		session.close();
		response.getWriter().print("Data Inserted");
		

	
		

	}
		
		
	 
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}