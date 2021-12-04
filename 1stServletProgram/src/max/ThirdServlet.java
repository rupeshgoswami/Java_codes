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
		PrintWriter out= response.getWriter();
		String ss = request.getParameter("n");
		out.println("form third servlet"+" "+ss);
		
	HttpSession sl = request.getSession();
     String s=(String) sl.getAttribute("n");
    out.println("Session="+s);		
	}

}
