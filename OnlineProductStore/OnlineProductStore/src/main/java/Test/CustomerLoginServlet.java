package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/custlogin")
public class CustomerLoginServlet extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
   {
	   PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		CustomerUserBean login = new CustomerLoginDao().customerDao(Long.parseLong(req.getParameter("cphno")), req.getParameter("cname"));
		if (login != null) {
			 pw.println("Welcome user:"+login.getName());
			pw.println("<h2>Login Successfully...</h2>");
			
		 
			RequestDispatcher rd = req.getRequestDispatcher("loginsuccess.html");
			rd.include(req, res);
			 
		} else {
			pw.println("<h2>Sorry !!! login failed</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
		
}
   }
}
