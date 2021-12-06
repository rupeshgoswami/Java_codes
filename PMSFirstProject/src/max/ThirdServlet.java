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
		PrintWriter out = response.getWriter();
		String nam = request.getParameter("n");
		out.println("name Third  Servlet "+nam.toUpperCase()); 
		
		HttpSession s = request.getSession(false); // becuase to track previous session if remain default/true then new session will create and value and racking of session is not possible
		String nn = (String)s.getAttribute("n");// because java is object oriented so downcasting
		out.println("sesssion "+nn);
		
	}

}
