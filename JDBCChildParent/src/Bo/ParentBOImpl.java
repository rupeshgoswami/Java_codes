package Bo;

import java.util.ArrayList;
import java.util.List;

import Bean.ChildBean;
import Bean.FatherBean;
import DTO.ChildDTO;
import DTO.FatherDTO;
import Dao.ParentsDAO;

public class ParentBOImpl implements ParentBO {

	
	public boolean getParentsDetails(FatherBean fatherBean) {
		List<ChildDTO> l=new ArrayList<ChildDTO>();
		String fn = fatherBean.getFname();
	fn=	fn.substring(0, 1).toUpperCase()+fn.substring(1).toLowerCase();
	FatherDTO fdto = new FatherDTO();
	fdto.setFname(fn);
	fdto.setAdd(fatherBean.getAdd().toLowerCase());
	List<ChildBean> list = fatherBean.getClist();
		for(ChildBean p:list)
		{
			ChildDTO cdto=new ChildDTO();
			cdto.setCname(p.getCname().toUpperCase());
			cdto.setGendr(p.getGendr().toUpperCase());
			l.add(cdto);
		}
		return new ParentsDAO().insertParentsDetails(fdto, l);
	}

}
