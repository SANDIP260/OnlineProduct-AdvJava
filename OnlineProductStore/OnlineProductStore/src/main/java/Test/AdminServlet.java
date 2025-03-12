package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminServlet extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
  {
	String un=req.getParameter("uname");
	String pw=req.getParameter("pword");
	AdminBean ab=new AdminLoginDao().Login(un,pw);
	if(ab==null)
	{
		req.setAttribute("msg", "Invalid Login Process...<br>");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}
	else
	{
		HttpSession hs=req.getSession();
		hs.setAttribute("abean", ab);
		req.getRequestDispatcher("LogSuccess.jsp").forward(req, res);
	}
	  
	  
	  
  }
}
