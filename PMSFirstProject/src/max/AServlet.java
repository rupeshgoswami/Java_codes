package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 13L; 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();///.......value printing on browser it is used..///
		
		 int amount=1000; 
		
		String nam = request.getParameter("n");
		out.println("name First Servlet "+nam.toUpperCase());//...out.println for printing on browser...//
		
		if(nam.equalsIgnoreCase("max"))
		{
	    request.getRequestDispatcher("SecondServlet").forward(request, response);
		}
		
		else if(nam.equals("online"))
		{
			
			
	//request.getRequestDispatcher("https://www.facebook.com/").forward(request, response);
			response.sendRedirect("https://www.facebook.com/?amounttt="+amount+" "); 
			
		}
		
		else 
		{
			HttpSession s = request.getSession();
			   s.setAttribute("n", nam.toUpperCase());
	request.getRequestDispatcher("ThirdServlet").include(request, response);
	
	   
		}
		
	
	}

}
