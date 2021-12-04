package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s = request.getParameter("n");
		out.println("State name :"+s.toUpperCase());
		//response.sendRedirect("https://currentaffairs.adda247.com/india-now-has-28-states-and-8-uts/"+ss);
	}

}
