package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		//String ss = request.getParameter("n");
		 HttpSession ses=request.getSession(false);
		String address= (String) ses.getAttribute("add");
		out.println("<br> Address from ThirdServlet by session :"+address.toUpperCase());
		
	}

}
