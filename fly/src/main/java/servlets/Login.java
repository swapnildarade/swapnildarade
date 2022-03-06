package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Log")
public class Login extends HttpServlet {
    public static boolean isLoggedIn = false;
    public static String pass = "abc";
    public static String username = "abc";

    @Override
    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        String u = req.getParameter("user");
        String p = req.getParameter("pass");

        if (u.equals(Login.username) && p.equals(Login.pass)){
            isLoggedIn = true;
            out.println("You have LoggedIn");
            resp.sendRedirect("admin-dashboard.jsp");
        }
        else {
            isLoggedIn = false;
            out.println("Login Failed : Incorrect email or Password");
        }
        out.close();
    }
}
