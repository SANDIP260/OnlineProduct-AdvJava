package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/custreg")
public class CustomerRegisterServlet extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   PrintWriter pw = res.getWriter();
		CustomerUserBean cub = new CustomerUserBean();
		res.setContentType("text/html");
		cub.setName(req.getParameter("name"));
		cub.setPhno(Long.parseLong(req.getParameter("phno")));
		cub.setCity("city");
		cub.setMid("mid");
		int k=new CusomerRegisterDao().customerdao(cub);
		if(k>0)
		{
			pw.println("<h3>registration successful ..</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.html");
			rd.include(req, res);
		}
		else
		{
			pw.println("<h3>Registeration Failed....");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.include(req, res);
		}
	   
	   
	   
	   
	   
   }
}
