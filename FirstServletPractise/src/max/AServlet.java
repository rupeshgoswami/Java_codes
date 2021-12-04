package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 10L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int amount = 1000;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String ss = request.getParameter("n");
		String aa = request.getParameter("a");
		out.println("Name FirstServlet :" + ss.toUpperCase());

		if (ss.equalsIgnoreCase("max")) {
			request.getRequestDispatcher("SecondServlet").forward(request, response);
		} else if (ss.equalsIgnoreCase("online")) {
			HttpSession ses = request.getSession();
			ses.setAttribute("add", aa);
			request.getRequestDispatcher("ThirdServlet").include(request, response);
		} else {

			response.sendRedirect("https://www.javatpoint.com/?amountt=" + amount + " ");

		}
	}

}
