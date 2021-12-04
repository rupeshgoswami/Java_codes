package max;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MobileOTPServ")
public class MobileOTPServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		String m = request.getParameter("mob");
			if(m.length()==10)
			{
				String otp = genrateOTP();
				out.println(otp);
			}
			else
			{
				out.println("invalid");
			}
	
	}
	public String genrateOTP()
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=9;i++)
		{
			sb.append(new Random().nextInt(10));
		}
		return  sb.substring(5);
		
	}
	
	
}
