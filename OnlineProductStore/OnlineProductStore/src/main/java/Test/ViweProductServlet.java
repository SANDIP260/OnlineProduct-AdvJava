package Test;
import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViweProductServlet extends HttpServlet
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
  HttpSession hs=req.getSession(false);
  if(hs==null)
  {
	 req.setAttribute("msg", "session expired...<br>");
	 req.getRequestDispatcher("Msg.jsp").forward(req, res);
  }
  else
  {
	  ArrayList<ProductBean> al=new ViewAllProductDao().retriveProduct();
	  hs.setAttribute("alist", al);
	  req.getRequestDispatcher("ViewAllProduct.jsp").forward(req, res);
  }
}
}
