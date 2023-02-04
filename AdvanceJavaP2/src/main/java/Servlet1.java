

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet
{
	
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  
	  PrintWriter pw=resp.getWriter();
	  
	  resp.setContentType("text/html");
	  
	  String u1=req.getParameter("uname");
	  String p1=req.getParameter("pass");
	  
	  if(u1.equals("admin")&&p1.equals("admin@123"))
	  {
		  RequestDispatcher rd=req.getRequestDispatcher("sucess.jsp");
		  rd.forward(req, resp);
		 // pw.print("LoginSucess!!!");
	  }
	  else
	  {
		  RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		  rd.include(req, resp);
		  
		  pw.print("<h1 style='color:red'>LoginFail!!!!</h1>");
	  }
	  
	  pw.println("Your username is::"+u1);
	  
	  pw.println("Your Password is::"+p1);
	  
	  
	  
	  
}	

}
