package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount=1000;
		PrintWriter out = response.getWriter();
		String ss = request.getParameter("n");
		out.println("Name is :"+ss.toUpperCase());
		
		if(ss.equalsIgnoreCase("state"))
		{
			request.getRequestDispatcher("SecondServlet").forward(request, response);
		}
		else if(ss.equalsIgnoreCase("city"))
		{
		 HttpSession s = request.getSession();
		 s.setAttribute("n", ss);
			request.getRequestDispatcher("ThirdServlet").include(request, response);
		}
		else
		{
			response.sendRedirect("https://www.google.co.in/?amnttt="+amount+" ");
		}
	}

}
