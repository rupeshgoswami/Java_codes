package max.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import max.JDBCUtility;

public class RegDAO {
	

	public  List<RegDTO> view()
	{
		 List<RegDTO> l=new ArrayList<RegDTO>();
		try {
			Connection con = JDBCUtility.getcon();
PreparedStatement ps = con.prepareStatement("select *from emps");
		   ResultSet rs = ps.executeQuery();
		   while(rs.next())
		   {
			   RegDTO regDTO=new RegDTO();
			   regDTO.setUid(rs.getString(1));
			   regDTO.setPass(rs.getString(2));
			   regDTO.setMob(rs.getString(3));
			   regDTO.setAdd(rs.getString(4));
			   l.add(regDTO);
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}

	
	
	
	
	public boolean insertReg(RegBean regBean)
	{
		try {
			Connection con = JDBCUtility.getcon();
PreparedStatement ps = con.prepareStatement("insert into emps values(?,?,?,?)");
ps.setString(1, regBean.getUid());
ps.setString(2, regBean.getPass());
ps.setString(3, regBean.getMob());
ps.setString(4, regBean.getAdd());

//		ps.setString(1, regBean.getAdd());
//		ps.setString(2, regBean.getMob());
//		ps.setString(3, regBean.getPass());
//		//ps.setString(4, regBean.getUid());
		int i=ps.executeUpdate();
		if(i>0)
		{
			return true;
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
