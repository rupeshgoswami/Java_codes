package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Bankserv")
public class Bankserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out = response.getWriter();
	 String ifscadd = request.getParameter("ifscadd");
	 System.out.println("in"+ifscadd);
	 BankDao bankDao = new BankDao();
	 String ad = bankDao.getBankAddByIFSC(ifscadd);
	 out.println(ad);
	 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
