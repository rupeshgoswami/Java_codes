package max.login;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class RegAction extends DispatchAction{
	
	public ActionForward save(ActionMapping mapping, ActionForm frm, 
			HttpServletRequest req, HttpServletResponse res)throws Exception
	       {
		RegBean regBean = (RegBean)frm;
		 
		RegDAO regDAO=new RegDAO();
		if(regDAO.insertReg(regBean))
		{
			req.setAttribute("s", "User Registration Successfully");
			return mapping.findForward("suc");
		}
		  else
		  {
			  req.setAttribute("u", "user unSuccessful");
			  return mapping.findForward("suc");
		  }
			  
		
		
		
		
	}

}
