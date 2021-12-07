package max.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import max.login.RegDAO;
import max.login.RegDTO;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ViewAction extends DispatchAction{
	public ActionForward viewDetail(ActionMapping mapping, ActionForm frm, 
			HttpServletRequest req, HttpServletResponse res)throws Exception
	       {
		
		RegDAO regDAO=new RegDAO();
		List<RegDTO> list = regDAO.view();
		
		 if(list.size()>0)
		 {
			 req.setAttribute("lst", list);
		 }
			return mapping.findForward("vieww");
		
	       }
		
}

