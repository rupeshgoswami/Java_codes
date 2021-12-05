package max.BO;

import java.util.List;
import java.util.Random;

import max.Bean.Child;
import max.Bean.Father;
import max.DAO.ParentsDAO;
import max.DTO.FatherDTO;

public class ParentsBO {
	
	public void getParentData(Father f,List<Child> clist)
	{
		
		FatherDTO fdto = new FatherDTO();
		fdto.setName(f.getName());
		fdto.setAadhar(f.getAadhar().length()==12 ? f.getAadhar():"000000000");
		fdto.setAdd(f.getAdd());
		fdto.setCategary(clist.size()>=3 ? "APL" : "BPL");
		fdto.setAppno(generateAppno());
		
		ParentsDAO parentsDAO=new ParentsDAO();
		parentsDAO.insertParentDetails(fdto,clist);
	}
		
		public String generateAppno()
		{
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<=9;i++)
			{
				sb.append(new Random().nextInt(10));
		}
		return " "+sb.toString();
		
		
		
		
		
	}

}
